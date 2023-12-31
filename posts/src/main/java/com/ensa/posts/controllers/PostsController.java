package com.ensa.posts.controllers;

import com.ensa.posts.dtos.PostDto;
import com.ensa.posts.services.PostsService;
import com.ensa.posts.models.Post;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/posts")
@AllArgsConstructor
public class PostsController {
    private final PostsService postsService;
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Post>> getPosts() {
        return  postsService.getPosts();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Post> createPost(@RequestBody PostDto postDto){
        return postsService.createPost(postDto);
    }

    @RequestMapping(value = "/filter", method = RequestMethod.GET)
    public ResponseEntity<List<Post>> searchPosts(@RequestParam("query") String query){
        return postsService.searchPosts(query);
    }
}
