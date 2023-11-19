package com.ensa.posts.dtos;

import com.ensa.posts.models.PostVisibility;
import lombok.Data;

@Data
public class NormalPostDto {
    private String content;
    private PostVisibility visibility;
    private Long authorId;
}
