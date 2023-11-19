package com.ensa.network.controllers;

import com.ensa.network.models.Network;
import com.ensa.network.services.NetworkService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value ="api/v1/networks")
@RestController
@AllArgsConstructor

public class NetworkController {
    private final NetworkService networkService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Network> getNetworks() {
        return networkService.getNetworks();
    }
}
