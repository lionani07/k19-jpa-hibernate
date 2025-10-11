package com.lionani07.jpa_hibernate;

import com.lionani07.jpa_hibernate.model.Estado;
import com.lionani07.jpa_hibernate.model.Governador;
import com.lionani07.jpa_hibernate.repositories.EstadoRepository;
import com.lionani07.jpa_hibernate.repositories.GovernadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JpaHibernateApplication implements CommandLineRunner {

	@Autowired
	private GovernadorRepository governadorRepository;

	@Autowired
	private EstadoRepository estadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Governador governador = new Governador(null, "Governado 1");

		this.governadorRepository.save(governador);

		Estado estado = new Estado(null, "Sao Paulo", governador);

		Estado rio = new Estado(null, "Rio de Janeiro", null);

		this.estadoRepository.saveAll(List.of(estado, rio));

	}
}
