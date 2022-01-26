package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HolamundoApplication {

	public static void main(String[] args) {

		SpringApplication.run(HolamundoApplication.class, args);
	}

	//esto es lo mismo que hacer un "autowired"
	@Bean
	PersonaService getPersonaService(){
		PersonaService p = new PersonaServiceImpl();
		//aqui le pongo un valor por defecto
		p.setNombre("el del bean");
		return p;
	}

}
