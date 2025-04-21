package com.junnu.sms.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.junnu.sms.models.*;
import com.junnu.sms.repos.PerformanceRepo;
import com.junnu.sms.repos.StudentRepo;

@Service
public class StudentService {
    @Autowired
    StudentRepo repo;
    @Autowired
    PerformanceRepo performance;

    public List<Student> getAllStudents(){
        return repo.findAll();
    }
    public List<Performance> getAllPer(){
        return performance.findAll();
    }

    public void addStudent(String roll,String emailString){
        Student temp = new Student();
        temp.setRollNo(roll);
        temp.setMailId(emailString);
        repo.save(temp);
        System.out.println("student added to table student with roll " + roll);
        Performance p = new Performance();
        p.setRollNo(roll);
        performance.save(p);
        System.out.println("student added to table performance with roll " + roll);

    }
    public String updateStudent(Student updatedStudent){
        String result = "student doesnt exist";
        Optional<Student> s = repo.findById(updatedStudent.getRollNo());
        if(s.isPresent()){
            repo.save(updatedStudent);
            result = "updation was successfull";
            return result;
        }
        return result;

    }
    public List<String> getAllStudentsMails(){
        List<Student> myList = getAllStudents();
        List<String> allMails = new ArrayList<>();
        for(Student student : myList){
            allMails.add(student.getMailId());
        }

        return allMails;
    }
    public String updatePerformance(Performance p){
        String result = "student doesnt exists";
        Optional<Performance> temp = performance.findById(p.getRollNo());
        if(temp.isPresent()){
            performance.save(p);
            return "updation was successful";
        }
        return result;
    }

    public ResponseEntity<?> getStudent(String roll){
        Optional<Student> temp =  repo.findById(roll);
       if(temp.isPresent()){
        return ResponseEntity.ok(temp);
       }
       return ResponseEntity.status(404).body("no student found with id " + roll);
        
    }
    
    public ResponseEntity<?> getperformance(String roll){
        Optional<Performance> temp =  performance.findById(roll);
       if(temp.isPresent()){
        return ResponseEntity.ok(temp);
       }
       return ResponseEntity.status(404).body("no student found with id " + roll);
        
    }
}
