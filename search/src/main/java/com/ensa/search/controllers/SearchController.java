package com.ensa.search.controllers;

import com.ensa.posts.models.Post;
import com.ensa.search.services.SearchService;
import com.ensa.search.models.Search;
import jakarta.ws.rs.QueryParam;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "api/v1/search")
@RestController
@AllArgsConstructor
public class SearchController {
    private final SearchService searchService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Post>> getSearches(@RequestParam() String query) {
        return searchService.search(query);
    }
}
