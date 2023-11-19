package com.ensa.posts.models;

import jakarta.persistence.*;
import lombok.Setter;

@Entity
@Setter
@Table
public class PostType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private PostTypeEnum postTypeEnum;
}
