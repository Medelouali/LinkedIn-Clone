package com.ensa.posts.models.postTypes;


import com.ensa.posts.models.PostType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@DiscriminatorValue("FindExpertPost")
public class FindExpertPost extends PostType {
    private String helpCategory;
    private String location;
    private String description;
}
