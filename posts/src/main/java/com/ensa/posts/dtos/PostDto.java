package com.ensa.posts.dtos;

import com.ensa.posts.models.PostTypeEnum;
import com.ensa.posts.models.PostVisibility;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class PostDto {
    private String content;
    private PostVisibility visibility;
    private String authorId;
    private PostTypeEnum postTypeEnum;
}
