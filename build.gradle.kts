plugins {
    java
    id("org.springframework.boot") version "3.5.6"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "com.kick"
version = "0.0.1-SNAPSHOT"
description = "kickdeer"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    //Jpa
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    //
    implementation("org.springframework.boot:spring-boot-starter-oauth2-client")
    //session for redis
    implementation("org.springframework.session:spring-session-data-redis")
    compileOnly("org.projectlombok:lombok")
    //docker
    developmentOnly("org.springframework.boot:spring-boot-docker-compose")
    implementation("com.h2database:h2")

    // swagger
    // https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-starter-webmvc-ui
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.8.9")

    annotationProcessor("org.projectlombok:lombok")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.boot:spring-boot-testcontainers")
    testImplementation("org.springframework.security:spring-security-test")
    testImplementation("org.testcontainers:junit-jupiter")
    testImplementation("org.testcontainers:mysql")

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
