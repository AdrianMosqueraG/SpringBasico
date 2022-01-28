package com.example.BS3.Beans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	public void llamada1(){

		System.out.println("Hola desde clase inicial");
	}

	@Bean
	CommandLineRunner ejectuame(){
		return p -> System.out.println("Hola desde clase secundaria");
		}

	@Bean
	CommandLineRunner ejectuame2(){
		Controller c = new Controller();
		return p -> System.out.println(c.getHola("Mensaje pasado por pasado como parametro"));
		}

}
