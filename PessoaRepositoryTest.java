package com.exemplo.demo;

import com.exemplo.demo.entities.Pessoa;
import com.exemplo.demo.repositories.PessoaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PessoaRepositoryTest {

    @Autowired
    private PessoaRepository repository;

    @Test
    void testInserirPessoa() {
        Pessoa p = new Pessoa("Pedro Silva", "12345678900", 1.78, 75.0);
        repository.save(p);
    }
}
