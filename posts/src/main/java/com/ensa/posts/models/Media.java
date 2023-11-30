package com.ensa.posts.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String url;
    private MediaType mediaType;
}
