package com.example.project.hospitalManagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@ToString
@Getter
@Setter
@Table(
        name ="patient_tbl",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"email"} , name = "")
        }



)
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ToString.Exclude
    private LocalDate birthDate;
    private String email;
    private String gender;


}
