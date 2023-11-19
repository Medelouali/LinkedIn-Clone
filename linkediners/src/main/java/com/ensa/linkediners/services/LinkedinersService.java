package com.ensa.linkediners.services;

import com.ensa.linkediners.models.Linkediner;
import com.ensa.linkediners.repos.LinkedinersRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LinkedinersService {
    private final LinkedinersRepo linkedinersRepo;

    public List<Linkediner> getLinkediners(){
        return linkedinersRepo.findAll();
    }
}
