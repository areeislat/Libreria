package com.example.Librerias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.Librerias.model.Libro;
import com.example.Librerias.repository.LibroRepository;
import com.example.Librerias.service.*; // aqui falta anotar la clase de java importada


@RestController
@RequestMapping("api/v1/libros")

public class LibroController {
        // aqui falta mucho codigo
        @Autowired
        private Libro libroService;

        @GetMapping
        public List<Libro> getLibro;
}
