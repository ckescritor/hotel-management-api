package com.hotel.management.model;

import jakarta.persistence.*;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;
    private String type;
    private Double price;
    private Boolean isAvailable;

    // Getters e Setters
}
