package com.example.docker_spring.controlles;

import com.example.docker_spring.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepo extends JpaRepository<Pessoa,Integer> {
    
}
