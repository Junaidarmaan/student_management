package com.junnu.sms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import com.junnu.sms.models.Credentials;
import com.junnu.sms.repos.CredentialsRepo;


@Service
public class CredentialsService {
    @Autowired
    CredentialsRepo repo;
    
    public String doUserExist(Credentials c){
        String result = "default message";
        String id = c.getUsername();
        Optional<Credentials> user =  repo.findById(id);
        if(user.isPresent()){
            if(!(user.get().getPassword().equals(c.getPassword()))){
                result = "wrong password buddy try again";    
            }else{
                result = "welcome back " + c.getUsername();
            }
        }else{
            repo.save(c);
            result = "new user successfully created";
        }
        return result;
    }
}
