package com.ensa.search.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Search {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
}
