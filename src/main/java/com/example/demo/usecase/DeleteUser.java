package com.example.demo.usecase;

import reactor.core.publisher.Mono;

@FunctionalInterface
public interface DeleteUser {

    Mono<Void> delete(String id);
}
