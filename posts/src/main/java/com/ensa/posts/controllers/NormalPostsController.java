package com.ensa.posts.controllers;

import com.ensa.posts.dtos.NormalPostDto;
import com.ensa.posts.models.NormalPost;
import com.ensa.posts.models.Post;
import com.ensa.posts.services.NormalPostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/posts/normal")
@AllArgsConstructor
public class NormalPostsController {
    private final NormalPostsService postsService;
    @RequestMapping(method = RequestMethod.GET)
    public List<NormalPost> getPosts() {
        return  postsService.getEvents();
    }
    @RequestMapping(method = RequestMethod.POST)
    public Post createPost(@RequestBody NormalPostDto normalPostDto){
        return postsService.createNormalPost(normalPostDto.getContent(), normalPostDto.getVisibility(), normalPostDto.getAuthorId());
    }
}
