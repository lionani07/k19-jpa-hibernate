package com.lionani07.jpa_hibernate.repositories;

import com.lionani07.jpa_hibernate.model.Autor;
import com.lionani07.jpa_hibernate.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
