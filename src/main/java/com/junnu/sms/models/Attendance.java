package com.junnu.sms.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Attendance {
    @Id
    String rollNo;
    Boolean c1,c2,c3,c4,c5,c6,c7,c8;
    LocalDate timeStamp = LocalDate.now();
    public String getRollNo() {
        return rollNo;
    }
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public Boolean getC1() {
        return c1;
    }
    public void setC1(Boolean c1) {
        this.c1 = c1;
    }
    public Boolean getC2() {
        return c2;
    }
    public void setC2(Boolean c2) {
        this.c2 = c2;
    }
    public Boolean getC3() {
        return c3;
    }
    public void setC3(Boolean c3) {
        this.c3 = c3;
    }
    public Boolean getC4() {
        return c4;
    }
    public void setC4(Boolean c4) {
        this.c4 = c4;
    }
    public Boolean getC5() {
        return c5;
    }
    public void setC5(Boolean c5) {
        this.c5 = c5;
    }
    public Boolean getC6() {
        return c6;
    }
    public void setC6(Boolean c6) {
        this.c6 = c6;
    }
    public Boolean getC7() {
        return c7;
    }
    public void setC7(Boolean c7) {
        this.c7 = c7;
    }
    public Boolean getC8() {
        return c8;
    }
    public void setC8(Boolean c8) {
        this.c8 = c8;
    }
    public LocalDate getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(LocalDate timeStamp) {
        this.timeStamp = timeStamp;
    }
}
