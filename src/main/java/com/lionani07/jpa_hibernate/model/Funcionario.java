package com.lionani07.jpa_hibernate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@AllArgsConstructor
@Data
public class Funcionario {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;
}
