package com.ensa.search.services;

import com.ensa.posts.models.Post;
import com.ensa.search.feignClient.FeignPostsInterface;
import com.ensa.search.models.Search;
import com.ensa.search.repos.SearchRepo;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SearchService {
    private final SearchRepo searchRepo;
    private final FeignPostsInterface feignPostsInterface;

    public List<Search> getSearches(){
        return searchRepo.findAll();
    }

    public ResponseEntity<List<Post>> search(String query) {
        return feignPostsInterface.searchPosts(query);
    }
}
