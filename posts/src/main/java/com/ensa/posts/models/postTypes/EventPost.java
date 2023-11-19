package com.ensa.posts.models.postTypes;

import com.ensa.posts.models.PostType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@DiscriminatorValue("EventPost")
public class EventPost extends PostType {
    private String eventDate;
    private String location;
}