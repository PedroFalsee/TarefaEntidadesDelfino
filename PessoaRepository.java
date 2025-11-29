package com.exemplo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exemplo.demo.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
