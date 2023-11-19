package com.ensa.posts.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@DiscriminatorValue("EventPost")
public class EventPost extends Post {
    private String eventDate;
    private String location;
}