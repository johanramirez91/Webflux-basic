package com.example.demo.repository;

import com.example.demo.collection.Usuario;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespositorioUsuario extends ReactiveMongoRepository<Usuario, String>  {
}
