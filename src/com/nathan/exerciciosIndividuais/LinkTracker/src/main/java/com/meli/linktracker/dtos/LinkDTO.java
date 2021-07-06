package com.meli.linktracker.dtos;

import com.meli.linktracker.models.Link;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
public class LinkDTO {

    public String maskedID;
    public int numberOfClicks;
    public static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    public LocalDateTime queryDate;

    public LinkDTO() {

    }

    public LinkDTO(Link link) {
        this.maskedID = link.getMaskedID();
        this.numberOfClicks = link.getNumberOfClicks();
        this.queryDate = LocalDateTime.now();
    }
}
