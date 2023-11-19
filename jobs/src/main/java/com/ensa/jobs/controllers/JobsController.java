package com.ensa.jobs.controllers;

import com.ensa.jobs.services.JobsService;
import com.ensa.jobs.models.Job;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/jobs")
@AllArgsConstructor
public class JobsController {
    private final JobsService jobsService;
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Job> getJobs(){
        return  jobsService.getJobs();
    }
}
