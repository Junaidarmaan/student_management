package com.junnu.sms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junnu.sms.models.*;
import com.junnu.sms.services.*;

@RestController
@RequestMapping("/Credentials")
public class CredentialsController {
    @Autowired
    private CredentialsService service;

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/student/verify")
    public String isUserExists(@RequestBody Credentials c){
        return service.doUserExist(c);
    }

    @PostMapping("/teacher/verify")
    public ResponseEntity<String> verifyOrAddTeacher(@RequestBody Teacher teacher) {
        String response = teacherService.verifyOrAddTeacher(teacher);
        return ResponseEntity.ok(response);
    }

   

}
