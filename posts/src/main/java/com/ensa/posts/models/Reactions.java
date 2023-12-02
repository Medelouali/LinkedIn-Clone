package com.ensa.posts.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table
@Entity
@Getter
@Setter
public class Reactions {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private Long likes;
    private Long laughs;
    private Long hearts;
    private Long lights;
    private Long handHearts;

    @OneToOne
    @JoinColumn()
    private Comment comment;

    @OneToOne
    @JoinColumn()
    private Post post;

    public Reactions() {
        this.likes=0L;
        this.laughs=0L;
        this.hearts=0L;
        this.lights=0L;
        this.handHearts=0L;
    }
}
