package com.ensa.posts.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String commenterId;
    private String text;

    @OneToMany
    private List<Comment> comments;

    @ManyToOne
    @JoinColumn()
    private Post post;

    @OneToOne
    private Reactions reactions;
}
