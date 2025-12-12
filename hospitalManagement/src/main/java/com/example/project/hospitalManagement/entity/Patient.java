package com.example.project.hospitalManagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@ToString
@Getter
@Setter
@Table(
        name ="patient_tbl",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"email"} , name = "unique_patient_email"),
                @UniqueConstraint(columnNames = {"birthDate", "name"} , name = "unique_patient_name_birthDate")
        },
        indexes = {
                @Index(columnList = "birthDate" , name = "idx_patient_birthdate")
        }




)
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "patient_name" , nullable = false)
    private String name;
    @ToString.Exclude
    private LocalDate birthDate;

    @Column(unique = true)
    private String email;
    private String gender;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;


}
