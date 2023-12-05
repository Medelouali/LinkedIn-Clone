package com.ensa.apigateway.feignClient;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("IDENTITY-PROVIDER/api/v1/auth")
public interface FeignIAMInterface {
    @GetMapping("/validate")
    public String validateToken(@RequestParam("token") String token) ;
}
