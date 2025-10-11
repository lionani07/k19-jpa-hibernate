package com.lionani07.jpa_hibernate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class Governador {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;
}
