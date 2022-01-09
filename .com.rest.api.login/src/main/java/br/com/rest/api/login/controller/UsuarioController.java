package br.com.rest.api.login.controller;

import br.com.rest.api.login.model.UsuarioModel;
import br.com.rest.api.login.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @GetMapping(path = "/api/usuario/{idUsuario}")
    public ResponseEntity consultuar(@PathVariable("idUsuario") Integer idUsuario){
        return repository.findById(idUsuario)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());


    }

    @PostMapping(path="/api/usuario/salvar")
    public UsuarioModel salvar(@RequestBody UsuarioModel usuario) {
        return repository.save(usuario);
    }
}

