package com.lionani07.jpa_hibernate.repositories;

import com.lionani07.jpa_hibernate.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
