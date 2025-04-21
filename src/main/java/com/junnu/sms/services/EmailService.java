package com.junnu.sms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.junnu.sms.models.Performance;

@Service
public class EmailService {
    
    
    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private StudentService students;

    
    public void sendEmailToAll(){
        List<String> emails = students.getAllStudentsMails();
        List<Performance> performances = students.getAllPer();

        for(String obj : emails){
            String temp = extractId(obj);
            for(Performance p : performances){
                if(p.getRollNo().equals(temp)){
                    if(p.getAttendance() < 75.0){
                        sendEmail(obj, "Your attendance percentage is below 75% make sure to attend the classess regularly this message shall be forwarded to your parents if you failed to recover next month Thank you");
                    }
                }
            }
        }
    }
    
    public void sendEmail(String to, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        
        message.setFrom("junnubest@gmail.com");
        message.setTo(to);
        message.setSubject("test");
        message.setText(body);
        
        mailSender.send(message);
    }
    
    public  String extractId(String id){
        String idExtension = id.split("@")[0]; 
        int index = idExtension.length() - 10;
        //junnu1234567890
        return idExtension.substring(index);
    }
    
}