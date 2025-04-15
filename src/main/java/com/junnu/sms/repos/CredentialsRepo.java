package com.junnu.sms.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junnu.sms.models.Credentials;

@Repository
public interface CredentialsRepo extends JpaRepository<Credentials,String> {
    
}
