package com.junnu.sms.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junnu.sms.models.Performance;


@Repository
public interface PerformanceRepo extends JpaRepository<Performance,String>{
    
}
