package com.kick.kickdeer.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth ->
                        auth.requestMatchers(
                                "/swagger-ui/**",
                                "v3/api-docs/**"
                        ).permitAll()
                                .anyRequest().authenticated()
                        )
                .csrf(csrf -> csrf.disable()) // CSRF 꺼주기 (REST API라면)
                .formLogin(login -> login.disable()) // 기본 로그인 폼 비활성화
                .oauth2Login(oauth2 -> oauth2.disable()); // OAuth2 로그인 비활성화

        return http.build();
    }
}
