package com.ensa.search.feignClient;


import com.ensa.posts.dtos.PostDto;
import com.ensa.posts.models.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("POSTS/api/v1/posts")
public interface FeignPostsInterface{
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Post>> getPosts();
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<List<Post>> createPost(@RequestBody PostDto postDto);
    @RequestMapping(value = "/filter", method = RequestMethod.GET)
    ResponseEntity<List<Post>> searchPosts(@RequestParam("query") String query);
}
