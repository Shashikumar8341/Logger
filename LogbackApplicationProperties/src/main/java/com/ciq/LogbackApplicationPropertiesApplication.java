package com.ciq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogbackApplicationPropertiesApplication {
	
	//To use SLF4J with Log4j as the logging implementation

	public static void main(String[] args) {
		SpringApplication.run(LogbackApplicationPropertiesApplication.class, args);
	}

}
