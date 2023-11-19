package com.ensa.linkediners.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Connecting {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private  String connecterId;
    private String connectedId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
}
