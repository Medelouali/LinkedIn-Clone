package com.ensa.posts.controllers;

import com.ensa.posts.dtos.EventPostDto;
import com.ensa.posts.models.EventPost;
import com.ensa.posts.services.EventsPostsService;
import com.ensa.posts.models.Post;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/posts/events")
@AllArgsConstructor
public class EventsPostsController {
    private final EventsPostsService postsService;
    @RequestMapping(method = RequestMethod.GET)
    public List<EventPost> getPosts() {
        return  postsService.getEvents();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Post createPost(@RequestBody EventPostDto eventPostDto){
        return postsService.createEvent(
                eventPostDto.getContent(),
                eventPostDto.getLocation(),
                eventPostDto.getVisibility()
        );
    }
}
