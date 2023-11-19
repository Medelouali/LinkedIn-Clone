package com.ensa.search.controllers;

import com.ensa.search.services.SearchService;
import com.ensa.search.models.Search;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping
@RestController
@AllArgsConstructor
public class SearchController {
    private final SearchService searchService;
    @RequestMapping(value ="", method = RequestMethod.GET)
    public List<Search> getSearches(){
        return searchService.getSearches();
    }
}
