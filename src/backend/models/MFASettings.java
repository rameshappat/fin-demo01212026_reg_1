package com.finusrreg.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class MFASettings {

    @Id
    private UUID userId;

    @Column(nullable = false)
    private String mfaType;

    @Column(nullable = false)
    private String mfaSecret;

    // Getters and setters
}