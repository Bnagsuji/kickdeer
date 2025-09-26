package com.kick.kickdeer.domain.complaint;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
public class ComplaintInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private  ComplaintResultType type;

    //신고 위치 정보 (위도, 경도)
    @NotNull
    private Double latitude;

    @NotNull
    private Double longitude;

    //수거완
    private Boolean completed;

    @CreatedDate
    private LocalDateTime createdDate;

}
