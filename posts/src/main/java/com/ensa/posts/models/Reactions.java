package com.ensa.posts.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
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

    @OneToOne(cascade = CascadeType.ALL)
    private Comment comment;

    @JsonIgnore
    @OneToOne(mappedBy = "reactions", cascade = CascadeType.ALL)
    private Post post;

    public Reactions() {
        this.likes=0L;
        this.laughs=0L;
        this.hearts=0L;
        this.lights=0L;
        this.handHearts=0L;
    }
}
