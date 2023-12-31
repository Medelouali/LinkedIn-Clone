package com.ensa.linkediners.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Linkediner {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @ElementCollection
    private List<String> conversationsIds;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
}
