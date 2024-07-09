package com.study.dvd.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class DVD {
    private int dvdId;
    private String registrationNumber;
    private String title;
    private int producerId;
    private int publisherId;
    private int publicationYear;
    private LocalDate databaseDate;

    // producer 와 publisher 의 정보들을 가지고 옴
    private Producer producer;
    private Publisher publisher;
}
