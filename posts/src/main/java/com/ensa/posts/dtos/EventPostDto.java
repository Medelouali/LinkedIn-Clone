package com.ensa.posts.dtos;

import com.ensa.posts.models.PostTypeEnum;
import com.ensa.posts.models.PostVisibility;
import lombok.Data;

@Data
public class EventPostDto {
    private String content;
    private PostVisibility visibility;
    private String location;
    private Long authorId;
}
