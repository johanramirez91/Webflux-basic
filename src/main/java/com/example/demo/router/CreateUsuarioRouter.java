package com.example.demo.router;

import com.example.demo.collection.Usuario;
import com.example.demo.usecase.CreateUsuario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;

@Configuration
public class CreateUsuarioRouter {

    @Bean
    public RouterFunction<ServerResponse> createUsuario(CreateUsuario createUsuario){
        return route(POST("/create").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(Usuario.class)
                        .flatMap(createUsuario::create)
                        .flatMap(response -> ServerResponse.status(HttpStatus.CREATED)
                                .contentType(MediaType.APPLICATION_JSON)
                                .bodyValue(response))
                        .onErrorResume(throwable -> {
                            throw new RuntimeException("Bad request", throwable);
                        }));
    }
}
