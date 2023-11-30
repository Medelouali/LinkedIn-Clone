package com.ensa.messages.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Conversation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String ownerId1;
    private String ownerId2;
    @Builder.Default
    private ConversationType conversationType=ConversationType.FOCUSED;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Message> messages;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @PrePersist
    protected void onCreate() {
        creationDate = new Date();
    }

    public void addMessage(Message message) {
        if (messages == null) {
            messages = new ArrayList<>();
        }
        messages.add(message);
    }
}
