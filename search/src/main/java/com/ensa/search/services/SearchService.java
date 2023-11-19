package com.ensa.search.services;

import com.ensa.search.models.Search;
import com.ensa.search.repos.SearchRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SearchService {
    private final SearchRepo searchRepo;
    public List<Search> getSearches(){
        return searchRepo.findAll();
    }
}
