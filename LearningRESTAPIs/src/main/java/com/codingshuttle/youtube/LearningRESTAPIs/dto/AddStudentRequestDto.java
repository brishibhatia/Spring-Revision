package com.codingshuttle.youtube.LearningRESTAPIs.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AddStudentRequestDto {
    @NotBlank
    @Size(min = 3,max = 30 ,message = "name should be in 3-30 chars")
    private String name;

    @Email
    @NotBlank(message = "email cant be blank")
    private String email;

}
