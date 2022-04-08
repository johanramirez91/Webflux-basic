package com.example.demo.usecase;

import com.example.demo.repository.RepositorioUsuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Service
public class DeleteUserImpl implements DeleteUser{

    private final RepositorioUsuario repositorioUsuario;

    @Override
    public Mono<Void> delete(String id) {
        return repositorioUsuario.deleteById(id);
    }
}
