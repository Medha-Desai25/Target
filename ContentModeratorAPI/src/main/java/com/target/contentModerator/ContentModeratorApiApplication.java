package com.target.contentModerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @SpringBootApplication is a convinience annotation, that adds, @Configuration, @ComponentScan, @EnableAutoConfiguration
// Springboot also handles tomcat config
@ComponentScan({"com.target*"})
@EntityScan("com.target*")
public class ContentModeratorApiApplication {

	//The main() method uses Spring Boot’s SpringApplication.run() method to launch an application
	//Perk of using Springboot , no XML config needed, not even WEB.XML as springboot takes care of it.
	public static void main(String[] args) {
		
		SpringApplication.run(ContentModeratorApiApplication.class, args);
	}

}
