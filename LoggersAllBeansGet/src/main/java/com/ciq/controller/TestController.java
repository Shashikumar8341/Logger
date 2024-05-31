package com.ciq.controller;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
@RequestMapping("/map")
public class TestController {

	private static final Logger loginfo = LoggerFactory.getLogger(TestController.class);

	@GetMapping(value = "/{name}")
	public String send(@PathVariable String name) {

		loginfo.info("test info logging");
		loginfo.debug("it consist to debug");
		return "Exists";
	}

    @Bean
    CommandLineRunner commandLineRunner(ApplicationContext ctx) {
	        return args -> {
	            // Log a message
	            loginfo.info("Let's inspect the beans provided by Spring Boot:");

	            // Get all bean names and sort them
	            String[] beanNames = ctx.getBeanDefinitionNames();
	            Arrays.sort(beanNames);
	          //  System.out.println(beanNames);

	            // Log each bean name
	            Arrays.stream(beanNames).forEach(beanName -> loginfo.info(beanName));
	        };
	    }

}
