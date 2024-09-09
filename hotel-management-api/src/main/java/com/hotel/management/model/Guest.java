package com.hotel.management.model;

import jakarta.persistence.*;

@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String document;
    private String phoneNumber;

    // Getters e Setters
}
