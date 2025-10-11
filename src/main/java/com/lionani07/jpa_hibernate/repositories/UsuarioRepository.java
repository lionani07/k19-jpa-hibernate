package com.lionani07.jpa_hibernate.repositories;

import com.lionani07.jpa_hibernate.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
