package com.lionani07.jpa_hibernate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Departamento {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    @OneToMany
    private List<Funcionario> funcionarios = new ArrayList<>();
}
