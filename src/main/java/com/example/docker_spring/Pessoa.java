package com.example.docker_spring;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class Pessoa {
    private Integer id;
    private String nome;
}
