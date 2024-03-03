package com.hakboub.hospitalspringapp.repository;


import com.hakboub.hospitalspringapp.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {


}
