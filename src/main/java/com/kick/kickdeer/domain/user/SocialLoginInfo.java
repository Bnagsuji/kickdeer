package com.kick.kickdeer.domain.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
public class SocialLoginInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Long userIdx;

    @NotNull
    private String providerId;

    @NotNull
    private SocialType socialType;

    @CreatedDate
    private LocalDateTime createdDate;

}
