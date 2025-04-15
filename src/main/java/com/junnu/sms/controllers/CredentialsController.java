package com.junnu.sms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junnu.sms.models.Credentials;
import com.junnu.sms.services.CredentialsService;

@RestController
@RequestMapping("/Credentials")
public class CredentialsController {
    @Autowired
    private CredentialsService service;

    @PostMapping
    public String isUserExists(@RequestBody Credentials c){
        System.out.println(c.getUsername());
        return service.doUserExist(c);
    }

}
