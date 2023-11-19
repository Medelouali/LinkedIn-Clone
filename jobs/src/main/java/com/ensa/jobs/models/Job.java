package com.ensa.jobs.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
}
