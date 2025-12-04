package com.example.project.hospitalManagement.repository;

import com.example.project.hospitalManagement.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient , Long>{

}
