package com.ensa.posts.models.postTypes;

import com.ensa.posts.models.PostType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.util.List;

@Entity
@Setter
@Getter
@DiscriminatorValue("PollPost")
public class PollPost extends PostType {
    private String question;
    private List<String> options;
    private Duration pollDuration;
}
