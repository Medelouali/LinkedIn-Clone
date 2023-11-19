package com.ensa.posts.repos;

import com.ensa.posts.models.NormalPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NormalPostRepo extends JpaRepository<NormalPost, String> {
}
