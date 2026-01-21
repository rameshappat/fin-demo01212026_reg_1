package com.finusrreg.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class KYCRecord {

    @Id
    private UUID userId;

    @Column(nullable = false)
    private String kycStatus;

    private Timestamp verifiedAt;

    // Getters and setters
}