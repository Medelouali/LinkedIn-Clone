package com.ensa.messages.models;

import com.ensa.posts.models.Media;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
}