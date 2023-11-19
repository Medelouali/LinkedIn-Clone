package com.ensa.jobs.repos;

import com.ensa.jobs.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobsRepo extends JpaRepository<Job, String> {
}
