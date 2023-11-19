package com.ensa.posts.dtos;

import com.ensa.posts.models.PostTypeEnum;
import com.ensa.posts.models.PostVisibility;
import lombok.Data;

@Data
public class PostDto {
    private String content;
    private PostVisibility visibility;
    private Long authorId;
    private PostTypeEnum postTypeEnum;
}
