package com.lionani07.jpa_hibernate;

import com.lionani07.jpa_hibernate.model.Usuario;
import com.lionani07.jpa_hibernate.repositories.UsuarioRepository;
import lombok.AllArgsConstructor;
import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class HomeController {

    private final UsuarioRepository usuarioRepository;

    @GetMapping
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("app run");
    }

    @PostMapping
    @RequestMapping("usuarios")
    public ResponseEntity<Usuario> criarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setEmail("usuario1@gmail.com");
        usuario.setDataCadastro(LocalDate.now());

        val save = this.usuarioRepository.save(usuario);

        return ResponseEntity.ok(usuario);
    }

    @GetMapping("usuarios")
    public ResponseEntity<List<Usuario>> getUsuarios() {
        val all = this.usuarioRepository.findAll();
        return ResponseEntity.ok(all);
    }
}
