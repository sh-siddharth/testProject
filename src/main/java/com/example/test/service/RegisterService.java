package com.example.test.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.model.Registration;

@Repository
public interface RegisterService extends JpaRepository<Registration, Long> {

  //String updateData(Registration registrationData, Long id);

}
