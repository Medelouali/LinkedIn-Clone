package com.ensa.notifications.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String content;
    @ElementCollection
    private List<String> keywords;
    private NotificationType notificationType;
    @ElementCollection
    private List<String> links;
    private String imageUrl;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @PrePersist
    protected void onCreate() {
        creationDate = new Date();
    }
}
