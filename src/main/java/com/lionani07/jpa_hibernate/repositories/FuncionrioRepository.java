package com.lionani07.jpa_hibernate.repositories;

import com.lionani07.jpa_hibernate.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionrioRepository extends JpaRepository<Funcionario, Long> {
}
