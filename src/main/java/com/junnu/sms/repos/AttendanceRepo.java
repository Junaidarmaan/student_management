package com.junnu.sms.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junnu.sms.models.Attendance;


@Repository
public interface AttendanceRepo extends JpaRepository<Attendance,String> {
    
}
