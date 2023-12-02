package com.ensa.posts.services;

import com.ensa.posts.dtos.PostDto;
import com.ensa.posts.models.*;
import com.ensa.posts.models.postTypes.NormalPost;
import com.ensa.posts.repos.PostTypeRepo;
import com.ensa.posts.repos.PostsRepo;
import com.ensa.posts.repos.ReactionsRepo;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class PostsService {
    private final PostTypeRepo postTypeRepo;
    private final PostsRepo postsRepo;
    private final ReactionsRepo reactionsRepo;

    public ResponseEntity<List<Post>> getPosts() {
        return  ResponseEntity.ok(postsRepo.findAll());
    }

    @Transactional
    public ResponseEntity<Post> createPost(PostDto postDto) {
        Post post = new Post();
        PostType type = new NormalPost();
        type.setPostTypeEnum(postDto.getPostTypeEnum());
        postTypeRepo.saveAndFlush(type);

        post.setPostType(type);
        post.setContent(postDto.getContent());
        post.setAuthorId(postDto.getAuthorId());
        post.setVisibility(postDto.getVisibility());

        Reactions reactions = new Reactions();
        reactionsRepo.saveAndFlush(reactions);

        post.setReactions(reactions);
        postsRepo.saveAndFlush(post);

        return ResponseEntity.ok(post);
    }

    //@KafkaListener(topics = TopicsNames.SEARCHES, groupId = "searchesId")
    public ResponseEntity<List<Post>> searchPosts(String query){
        log.info("The search term:\t"+query);
        return ResponseEntity.ok(postsRepo.findAll());
    }
}
