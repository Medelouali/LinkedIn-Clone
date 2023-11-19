package com.ensa.posts.repos;

import com.ensa.posts.models.EventPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventsRepo extends JpaRepository<EventPost, String> {
}
