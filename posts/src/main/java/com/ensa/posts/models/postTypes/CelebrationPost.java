package com.ensa.posts.models.postTypes;

import com.ensa.posts.models.PostType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@DiscriminatorValue("CelebrationPost")
public class CelebrationPost extends PostType {
    private String tile;
    private String description;
}
