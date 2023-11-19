package com.ensa.search.repos;

import com.ensa.search.models.Search;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchRepo extends JpaRepository<Search, String> {
}
