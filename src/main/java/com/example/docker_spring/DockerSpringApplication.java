package com.example.docker_spring;

import com.example.docker_spring.controlles.PessoaRepo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DockerSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringApplication.class, args);
	}


	@Bean
	public CommandLineRunner init(PessoaRepo pessoaRepo){
		return args->{
			pessoaRepo.save(new Pessoa(1,"Alcides"));
		};
	}
}
