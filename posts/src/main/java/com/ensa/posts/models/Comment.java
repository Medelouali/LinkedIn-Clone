package com.ensa.posts.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String commenterId;
    private String text;

    @JsonBackReference
    @OneToMany()
    private List<Comment> comments;

    @ManyToOne(cascade = CascadeType.ALL)
    private Post post;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "comment")
    private Reactions reactions;
}
