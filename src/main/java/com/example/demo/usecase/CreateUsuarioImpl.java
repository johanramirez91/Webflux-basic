package com.example.demo.usecase;

import com.example.demo.collection.Usuario;
import com.example.demo.repository.RepositorioUsuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class CreateUsuarioImpl implements CreateUsuario{

    private final RepositorioUsuario repositorioUsuario;

    @Override
    public Mono<Usuario> create(Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }
}
