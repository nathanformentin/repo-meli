package com.meli.linktracker.models;

import lombok.Data;

@Data
public class Link {

    public String maskedID;
    public int numberOfClicks = 0;

    public Link(String linkID) {
        this.maskedID = linkID;
    }
}
