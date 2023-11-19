package com.ensa.posts.services;

import com.ensa.posts.models.*;
import com.ensa.posts.repos.EventsRepo;
import com.ensa.posts.repos.NormalPostRepo;
import com.ensa.posts.repos.PostTypeRepo;
import com.ensa.posts.repos.PostsRepo;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class NormalPostsService {
    private final PostsRepo postsRepo;
    private final PostTypeRepo postTypeRepo;
    private final NormalPostRepo normalPostRepo;

    public List<NormalPost> getEvents() {
        return  normalPostRepo.findAll();
    }

    public Post createNormalPost(String content, PostVisibility visibility, Long authorId) {
        PostType newPostType = new PostType();
        newPostType.setPostTypeEnum(PostTypeEnum.NORMAL);
        PostType postType =  postTypeRepo.save(newPostType);

        EventPost event = new EventPost();
        event.setContent(content);
        event.setEventDate(new Date().toString());
        event.setAuthorId(authorId);
        event.setPostType(postType);
        event.setVisibility(visibility);
        return postsRepo.save(event);
    }
}
