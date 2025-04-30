package com.junnu.sms.repos;

import com.junnu.sms.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, String> {
 Teacher findByUsername(String username);
}
