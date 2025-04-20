package com.junnu.sms.models;


import java.util.Map;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Performance {
    @Id
    String rollNo = "user@gritcollege.com";
    @ElementCollection
    Map<String,Integer> marks;
    float attendance  = 0;
    public String getRollNo() {
        return rollNo;
    }
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public Map<String, Integer> getMarks() {
        return marks;
    }
    public void setMarks(Map<String, Integer> marks) {
        this.marks = marks;
    }
    public float getAttendance() {
        return attendance;
    }
    public void setAttendance(float attendance) {
        this.attendance = attendance;
    }
}
