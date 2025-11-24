package com.codingshuttle.youtube.LearningRESTAPIs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
private String name;
private String email;

    public void setId(Long id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return Id;
    }

    public String getEmail() {
        return email;
    }
}
