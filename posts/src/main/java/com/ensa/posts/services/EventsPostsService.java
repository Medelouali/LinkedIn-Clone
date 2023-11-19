package com.ensa.posts.services;

import com.ensa.posts.models.*;
import com.ensa.posts.repos.EventsRepo;
import com.ensa.posts.repos.PostTypeRepo;
import com.ensa.posts.repos.PostsRepo;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class EventsPostsService {
    private final PostsRepo postsRepo;
    private final EventsRepo eventsRepo;
    private final PostTypeRepo postTypeRepo;

    public List<EventPost> getEvents() {
        return  eventsRepo.findAll();
    }

    @Transactional
    public Post createEvent(String content, String location, PostVisibility visibility) {
        PostType newPostType = new PostType();
        newPostType.setPostTypeEnum(PostTypeEnum.EVENT);
        PostType postType =  postTypeRepo.save(newPostType);

        EventPost event = new EventPost();
        event.setContent(content);
        event.setEventDate(new Date().toString());
        event.setLocation(location);
        event.setAuthorId(1L);
        event.setPostType(postType);
        event.setVisibility(visibility);
        return postsRepo.save(event);
    }
}
