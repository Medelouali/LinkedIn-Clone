package com.ensa.jobs.services;

import com.ensa.jobs.models.Job;
import com.ensa.jobs.repos.JobsRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class JobsService {
    private final JobsRepo jobsRepo;

    public List<Job> getJobs(){
        return  jobsRepo.findAll();
    }
}
