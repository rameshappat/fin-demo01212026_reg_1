package com.finusrreg.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String passwordHash;

    @Column(nullable = false)
    private Timestamp createdAt;

    // Getters and setters
}