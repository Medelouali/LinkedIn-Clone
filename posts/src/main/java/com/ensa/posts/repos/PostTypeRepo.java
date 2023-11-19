package com.ensa.posts.repos;

import com.ensa.posts.models.PostType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostTypeRepo extends JpaRepository<PostType, String> {
}
