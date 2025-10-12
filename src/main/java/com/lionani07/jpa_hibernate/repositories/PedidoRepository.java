package com.lionani07.jpa_hibernate.repositories;

import com.lionani07.jpa_hibernate.model.Cliente;
import com.lionani07.jpa_hibernate.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
