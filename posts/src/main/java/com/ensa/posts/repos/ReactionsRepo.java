package com.ensa.posts.repos;

import com.ensa.posts.models.Reactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactionsRepo extends JpaRepository<Reactions, String> {
}
