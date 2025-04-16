package com.junnu.sms.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junnu.sms.models.Attendance;
import com.junnu.sms.repos.AttendanceRepo;

@Service
public class AttendanceService {
    @Autowired
    AttendanceRepo repo;
    public void markpresent(Attendance obj,int hour){
        Optional<Attendance> temp = repo.findById(obj.getRollNo());
        if(temp.isPresent()){
            switch (hour) {
                case 1:
                    obj.setC1(true);
                    break;
                case 2:
                    obj.setC2(true);
                break;
                case 3:
                    obj.setC3(true);
                break;
                case 4:
                    obj.setC4(true);
                break;
                case 5:
                    obj.setC5(true);
                break;
                case 6:
                    obj.setC6(true);
                break;
                case 7:
                    obj.setC7(true);
                break;
                case 8:
                    obj.setC8(true);
                break;
                default:
                    break;
            }
        }
    }
}
