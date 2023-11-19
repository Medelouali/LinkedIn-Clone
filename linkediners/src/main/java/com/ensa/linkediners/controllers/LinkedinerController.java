package com.ensa.linkediners.controllers;

import com.ensa.linkediners.services.LinkedinersService;
import com.ensa.linkediners.models.Linkediner;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "api/v1/linkediners")
public class LinkedinerController {
    private final LinkedinersService linkedinersService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Linkediner> getLinkediners(){
        return linkedinersService.getLinkediners();
    }
}
