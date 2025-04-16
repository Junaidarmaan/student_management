package com.junnu.sms.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junnu.sms.models.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,String>  {
    
}
