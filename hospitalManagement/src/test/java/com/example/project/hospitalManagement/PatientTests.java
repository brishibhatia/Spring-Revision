package com.example.project.hospitalManagement;

import com.example.project.hospitalManagement.entity.Patient;
import com.example.project.hospitalManagement.repository.PatientRepository;
import com.example.project.hospitalManagement.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
public class PatientTests {
    @Autowired
    private PatientService patientService;

    @Autowired
    private PatientRepository patientRepository;

    @Test
    void testPatientRepository() {
        Patient patient = new Patient();
        patient.setName("Rishi");
        patient.setEmail("rishi@test.com"); // ✅ REQUIRED
        patient.setGender("male");
//        patient.setBloodGroup("A_positive");
        patient.setBirthdate(LocalDate.of(2002, 5, 10));

        patientRepository.save(patient);
    }
    @Test
    public void testTransactionMethods(){
       Patient patient = patientService.getPatientById(1L);
       System.out.println(patient);
    }
//    great
}
