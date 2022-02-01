package com.example.PropertyConfigurationEjemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
//@EnableConfigurationProperties(SimpleProperties.class) //hace lo mismo que poner la etiqueta component en la clase
@ConfigurationPropertiesScan  //hace lo mismo que la linea de arriba
public class PropertyConfigurationEjemploApplication {

	@Autowired
	private SimpleProperties simpleProperties;

	@Autowired
	private ImmutableProperties immutableProperties;

	@Autowired
	private NestedProperties nestedProperties;

	@Autowired
	private ConvertedProperties convertedProperties;

	@Autowired
	private BeanProperties beanProperties;

	public static void main(String[] args) {
		SpringApplication.run(PropertyConfigurationEjemploApplication.class, args);
	}

	@PostConstruct
	private void postInit(){
		System.out.println("simple properties info...");
		System.out.println(simpleProperties);

		System.out.println("");

		System.out.println("Immutable properties info...");
		System.out.println(immutableProperties);

		System.out.println("");

		System.out.println("Nested properties info...");
		System.out.println(nestedProperties);

		System.out.println("");

		System.out.println("Converted properties info...");
		System.out.println(convertedProperties);
		System.out.println("");
		System.out.println("Converted properties info2...");
		System.out.println(convertedProperties.getDuration().toNanos() + " ns");
		System.out.println(convertedProperties.getPeriod().getYears() + " years " + convertedProperties.getPeriod().getDays() + " days");
		System.out.println(convertedProperties.getDataSize().toTerabytes() + " teraBytes");
		System.out.println(convertedProperties.getCustomProperty().getName());
		System.out.println(convertedProperties.getCustomProperty().isImmutable());

		System.out.println("");

		System.out.println("Bean properties info...");
		System.out.println(beanProperties.getName());

		System.out.println("");
	}

	@ConfigurationProperties(prefix = "bean")
	@Bean
	BeanProperties beanProperties(){
		return new BeanProperties();
	}

}
