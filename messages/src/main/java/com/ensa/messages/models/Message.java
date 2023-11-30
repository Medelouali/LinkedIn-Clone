package com.ensa.messages.models;

import com.ensa.posts.models.Media;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String receiverId;
    private String conversationId;
    private String senderId;
    private String message;
    @Builder.Default
    @ElementCollection
    private List<String> docsIds=new ArrayList<>();
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @PrePersist
    protected void onCreate() {
        creationDate = new Date();
    }
}