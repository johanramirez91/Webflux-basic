package com.example.demo.collection;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
@AllArgsConstructor
@Data
public class Usuario implements Serializable {

    @Id
    private String id;
    private String nombre;
    private String edad;

    public Usuario() {
    }
}
