package com.example.demo.service;

import com.example.demo.model.Teacher;
import com.example.demo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public String verifyOrAddTeacher(Teacher teacher) {
        String username = teacher.getUsername();

        if (!username.endsWith(".grietcollege.com")) {
            return "Please use your college email ID (e.g., username@grietcollege.com)";
        }

        Teacher existingTeacher = teacherRepository.findByUsername(username);

        if (existingTeacher != null) {
            if (existingTeacher.getPassword().equals(teacher.getPassword())) {
                return "Welcome back, " + username + "!";
            } else {
                return "Username exists, but password is incorrect!";
            }
        } else {
            teacherRepository.save(teacher);
            return "New teacher added: " + username;
        }
    }
}
