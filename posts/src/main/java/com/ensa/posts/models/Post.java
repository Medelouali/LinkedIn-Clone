package com.ensa.posts.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "post_type")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    List<Media> media;
    private PostVisibility visibility;
    private String content;
    private Long authorId;
    @ManyToOne
    private PostType postType;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
}
