package com.junnu.sms.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.junnu.sms.models.Performance;

public interface PerformanceRepo extends JpaRepository<Performance,String>{
    
}
