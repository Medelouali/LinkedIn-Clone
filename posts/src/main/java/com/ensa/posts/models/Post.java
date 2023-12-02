package com.ensa.posts.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "post_type")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private PostVisibility visibility;
    private String content;
    private String authorId;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    List<Media> media=new ArrayList<>();

    @ManyToOne
    @JsonBackReference
    private PostType postType;

    @JsonBackReference
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> comments = new ArrayList<>();

    @JsonBackReference
    @OneToOne(cascade = CascadeType.ALL)
    private Reactions reactions;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @PrePersist
    protected void onCreate() {
        reactions=new Reactions();
        creationDate = new Date();
    }
}
