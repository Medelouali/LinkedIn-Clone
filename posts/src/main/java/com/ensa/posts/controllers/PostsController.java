package com.ensa.posts.controllers;

import com.ensa.posts.dtos.PostDto;
import com.ensa.posts.services.PostsService;
import com.ensa.posts.models.Post;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/posts")
@AllArgsConstructor
public class PostsController {
    private final PostsService postsService;
    @RequestMapping(method = RequestMethod.GET)
    public List<Post> getPosts() {
        return  postsService.getEvents();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Post createPost(@RequestBody PostDto postDto){
        return postsService.createPost(postDto);
    }
}
