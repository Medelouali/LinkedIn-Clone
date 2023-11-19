package com.ensa.posts.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "post_type")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private PostVisibility visibility;
    private String content;
    private Long authorId;
    @ManyToOne
    @JoinColumn(name = "post_type_id")
    private PostType postType;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
}
