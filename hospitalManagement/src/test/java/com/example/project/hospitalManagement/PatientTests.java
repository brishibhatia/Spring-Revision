package com.example.project.hospitalManagement;

import com.example.project.hospitalManagement.entity.Patient;
import com.example.project.hospitalManagement.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientTests {
    @Autowired
    private PatientRepository patientRepository;

   @Test
    public void testPatientRepository(){
        List<Patient> PatientList =  patientRepository.findAll();
        System.out.println(PatientList);

        Patient p1 = new Patient();
        patientRepository.save(p1);
    }
//    great
}
