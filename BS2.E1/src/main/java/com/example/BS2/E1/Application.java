package com.example.BS2.E1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	@Qualifier("persona1")
	Persona getPersona1(String name, Integer edad, String ciudad){
		Persona p = new Persona();
		p.setName(name);
		p.setEdad(edad);
		p.setCiudad(ciudad);

		PersonaService pS = new PersonaServiceImpl();
		pS.getPersona(p.getName(), p.getEdad(), p.getCiudad());

		return p;
	}

	@Bean
	@Qualifier("persona2")
	Persona getPersona2(String name, Integer edad, String ciudad){
		Persona p = new Persona();
		p.setName(name);
		p.setEdad(edad);
		p.setCiudad(ciudad);

		PersonaService pS = new PersonaServiceImpl();
		pS.getPersona(p.getName(), p.getEdad(), p.getCiudad());

		return p;
	}

	@Bean
	@Qualifier("persona3")
	Persona getPersona3(String name, Integer edad, String ciudad){
		Persona p = new Persona();
		p.setName(name);
		p.setEdad(edad);
		p.setCiudad(ciudad);

		PersonaService pS = new PersonaServiceImpl();
		pS.getPersona(p.getName(), p.getEdad(), p.getCiudad());

		return p;
	}

}