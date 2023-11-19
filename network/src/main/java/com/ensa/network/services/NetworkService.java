package com.ensa.network.services;

import com.ensa.network.models.Network;
import com.ensa.network.repos.NetworkRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NetworkService {
    private final NetworkRepo networkRepo;

    public List<Network> getNetworks() {
        return networkRepo.findAll();
    }
}
