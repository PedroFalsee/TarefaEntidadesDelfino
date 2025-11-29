package com.exemplo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exemplo.demo.entities.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
