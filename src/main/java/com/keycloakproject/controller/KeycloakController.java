package com.keycloakproject.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/keycloak")
public class KeycloakController {

    @GetMapping
    @PreAuthorize("hasRole('client_user')")
    public String call(){
        return "Hello from Spring Boot + Keycloak";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('client_admin')")
    public String call2(){
        return "Hello from Spring Boot + Keycloak for Admin";
    }

}
