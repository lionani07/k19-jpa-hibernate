package com.lionani07.jpa_hibernate;

import com.lionani07.jpa_hibernate.model.Departamento;
import com.lionani07.jpa_hibernate.model.Estado;
import com.lionani07.jpa_hibernate.model.Funcionario;
import com.lionani07.jpa_hibernate.model.Governador;
import com.lionani07.jpa_hibernate.repositories.DepartamentoRepository;
import com.lionani07.jpa_hibernate.repositories.EstadoRepository;
import com.lionani07.jpa_hibernate.repositories.FuncionrioRepository;
import com.lionani07.jpa_hibernate.repositories.GovernadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JpaHibernateApplication implements CommandLineRunner {

	@Autowired
	private DepartamentoRepository departamentoRepository;

	@Autowired
	private FuncionrioRepository funcionrioRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Funcionario funcionario = new Funcionario(null, "Funcionario 1");

		this.funcionrioRepository.save(funcionario);

		Departamento departamento = new Departamento();
		departamento.setNome("Departamento");
		departamento.setFuncionarios(List.of(funcionario));

		this.departamentoRepository.save(departamento);

	}
}
