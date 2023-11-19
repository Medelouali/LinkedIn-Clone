package com.ensa.linkediners.repos;

import com.ensa.linkediners.models.Linkediner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkedinersRepo extends JpaRepository<Linkediner, String> {
}
