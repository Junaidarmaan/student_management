package com.junnu.sms.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Performance {
    @Id
    String rollNo = "user@gritcollege.com";
    String subject1  = "not known yet";
    String subject2  = "not known yet";
    String subject3 = "not known yet";
    int attendance  = 0;
    public String getRollNo() {
        return rollNo;
    }
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public String getSubject1() {
        return subject1;
    }
    public void setSubject1(String subject1) {
        this.subject1 = subject1;
    }
    public String getSubject2() {
        return subject2;
    }
    public void setSubject2(String subject2) {
        this.subject2 = subject2;
    }
    public String getSubject3() {
        return subject3;
    }
    public void setSubject3(String subject3) {
        this.subject3 = subject3;
    }
    public int getAttendance() {
        return attendance;
    }
    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }
    
}
