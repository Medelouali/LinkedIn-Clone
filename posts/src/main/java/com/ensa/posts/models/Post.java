package com.ensa.posts.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "post_type")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @OneToMany
    List<Media> media;
    private PostVisibility visibility;
    private String content;
    private String authorId;
    @ManyToOne
    private PostType postType;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @PrePersist
    protected void onCreate() {
        creationDate = new Date();
    }
}
