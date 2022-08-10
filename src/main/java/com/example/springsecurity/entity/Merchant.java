package com.example.springsecurity.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Merchant {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String userName;
    private String password;
    private String role;
}
