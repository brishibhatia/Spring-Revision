package com.codingshuttle.youtube.LearningRESTAPIs.controller;

import com.codingshuttle.youtube.LearningRESTAPIs.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
@GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(2L , "Rishi" , "brihi@gmail.com");
    }
    @GetMapping("/student/{id}")
    public StudentDto getStudentbyid(){
    return new StudentDto(33L , "Bhatia", "g@gmail.com");
    }
}
