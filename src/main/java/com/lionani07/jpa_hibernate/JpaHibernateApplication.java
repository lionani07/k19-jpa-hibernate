package com.lionani07.jpa_hibernate;

import com.lionani07.jpa_hibernate.model.Autor;
import com.lionani07.jpa_hibernate.model.Cliente;
import com.lionani07.jpa_hibernate.model.Livro;
import com.lionani07.jpa_hibernate.model.Pedido;
import com.lionani07.jpa_hibernate.repositories.AutorRepository;
import com.lionani07.jpa_hibernate.repositories.LivroRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class JpaHibernateApplication implements CommandLineRunner {

	@Autowired
	private LivroRepository livroRepository;

	@Autowired
	private AutorRepository autorRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Autor autor = new Autor();
		autor.setNome("Autor 1");

		Autor autor1 = new Autor();
		autor1.setNome("Autor 2");

		val autores = List.of(autor, autor1);

		this.autorRepository.saveAll(autores);

		Livro livro = new Livro();
		livro.setNome("Livro 1");
		livro.setAutores(autores);

		this.livroRepository.save(livro);
	}
}
