package com.ensa.network.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import java.util.Date;

@Entity
@Table
public class Network {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
}
