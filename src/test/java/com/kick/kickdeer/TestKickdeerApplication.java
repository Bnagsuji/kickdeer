package com.kick.kickdeer;

import org.springframework.boot.SpringApplication;

public class TestKickdeerApplication {

    public static void main(String[] args) {
        SpringApplication.from(KickdeerApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
