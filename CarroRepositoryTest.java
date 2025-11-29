package com.exemplo.demo;

import com.exemplo.demo.entities.Carro;
import com.exemplo.demo.repositories.CarroRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CarroRepositoryTest {

    @Autowired
    private CarroRepository repository;

    @Test
    void testInserirCarro() {
        Carro c = new Carro("Volkswagen", "Gol", 2015, 2016, 35000.0);
        repository.save(c);
    }
}
