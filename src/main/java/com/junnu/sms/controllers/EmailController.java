package com.junnu.sms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.junnu.sms.services.EmailService;

@RestController
@RequestMapping("/mail")
public class EmailController {
    @Autowired
    private EmailService mailService;

    // @PostMapping("/sendAll")
    // public void sendMailToAll(){
    //     System.out.println("hello");
    // }

    @PostMapping("/send")
    public void sendMail(@RequestParam String mail,String message){
        mailService.sendEmail(mail, message);
    }

    @GetMapping("/sendAttendanceWarning")
    public void sendAttendanceWarning(){
        mailService.sendEmailToAll();
    }

}
