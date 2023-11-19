package com.ensa.posts.services;

import com.ensa.posts.dtos.PostDto;
import com.ensa.posts.models.*;
import com.ensa.posts.models.postTypes.NormalPost;
import com.ensa.posts.repos.PostTypeRepo;
import com.ensa.posts.repos.PostsRepo;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class PostsService {
    private final PostsRepo postsRepo;
    private final PostTypeRepo postTypeRepo;

    public List<Post> getEvents() {
        return  postsRepo.findAll();
    }

    @Transactional
    public Post createPost(PostDto postDto) {
        Post post = new Post();
        PostType type = new NormalPost();
        type.setPostTypeEnum(postDto.getPostTypeEnum());
        this.postTypeRepo.save(type);

        post.setPostType(type);
        post.setContent(post.getContent());
        post.setAuthorId(post.getAuthorId());
        post.setMedia(new ArrayList<>());
        post.setVisibility(postDto.getVisibility());

        return postsRepo.save(post);
    }
}
