package com.example.demo.usecase;

import com.example.demo.collection.Usuario;
import reactor.core.publisher.Mono;

@FunctionalInterface
public interface CreateUsuario {

    Mono<Usuario> create(Usuario usuario);
}
