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
    @Autowired
    StudentService sr;
    @Autowired
    EmailService email;
    public String doUserExist(Credentials c){
        System.out.println(String .format("Received following credentials %s and %s", c.getUsername() , c.getPassword()));
        String result = "default message";
        String id = extractId(c.getUsername());
        String idExtension = c.getUsername().split("@")[1]; 
         
        Optional<Credentials> user =  repo.findById(c.getUsername());
        if(!idExtension.equals("grietcollege.com")){
            return "use your official mail id please";
        }
        if(user.isPresent() && user.get().getPassword().equals(c.getPassword())){
            System.out.println(String.format("user is alreday present in the db  with following details %s and %s", user.get().getUsername(),user.get().getPassword()));
                result = "welcome back " + c.getUsername();
        }
        else if(user.isPresent() && !(user.get().getPassword().equals(c.getPassword()))){
            result = "wrong password please try again"; 
        }else{
            repo.save(c);
            result = "new user successfully created";
            sr.addStudent(id,c.getUsername());
            email.sendEmail("junnubest@gmail.com", String.format("a new user has been created with mail id %s", c.getUsername()));
        }
        return result;
    }

    public  String extractId(String id){
        String idExtension = id.split("@")[0]; 
        int index = idExtension.length() - 10;
        //junnu1234567890
        return idExtension.substring(index);
    }
}
