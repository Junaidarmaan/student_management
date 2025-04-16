package com.junnu.sms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junnu.sms.models.*;
import com.junnu.sms.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService student;

    @PostMapping("/updateStudent")
    public String updatedStudent(@RequestBody Student s){
        return student.updateStudent(s);
    }

    @PostMapping("/updatePerformance")
    public String updatePerformance(@RequestBody Performance p){
        return student.updatePerformance(p);
    }

     @GetMapping("getStudent/{roll}")
    public ResponseEntity<?> getStudent(@PathVariable String roll){
        return student.getStudent(roll);   
    }

    
    @GetMapping("getPerformance/{roll}")
    public ResponseEntity<?> getPerformance(@PathVariable String roll){
        return student.getperformance(roll);   
    }
    @GetMapping("getAll/students")
    public List<Student> getAllstud(){
        return student.getAllStudents();
    }
    @GetMapping("getAll/performance")
    public List<Performance> getAllPer(){
        return student.getAllPer(); 
    }
}
