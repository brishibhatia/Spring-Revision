package com.example.project.hospitalManagement.service;

import com.example.project.hospitalManagement.entity.Patient;
import com.example.project.hospitalManagement.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    private final PatientRepository patientRepository;


    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
    @Transactional
    public Patient getPatientById(Long id){
       Patient p1 = patientRepository.findById(id).orElseThrow();
        Patient p2 = patientRepository.findById(id).orElseThrow();
        p1.setName("yoso");

        return p1;
    }
}
