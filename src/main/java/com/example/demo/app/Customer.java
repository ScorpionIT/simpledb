package com.example.demo.app;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Customer {
    private long id;
    private String fio;
    private String phone;
    private String address;
    private LocalDateTime created;
}
