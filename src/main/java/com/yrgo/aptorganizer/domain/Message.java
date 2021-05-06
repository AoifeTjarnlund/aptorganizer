package com.yrgo.aptorganizer.domain;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.time.LocalTime;

public class Message {
    public String txt;
    public LocalTime time;
    public LocalDate date;
    @Id
    public int id;


}
