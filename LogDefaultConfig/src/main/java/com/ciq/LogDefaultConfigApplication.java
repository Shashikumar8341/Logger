package com.ciq;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LogDefaultConfigApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(LogDefaultConfigApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LogDefaultConfigApplication.class, args);
    }

    @Bean
     CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            LOGGER.info("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            Arrays.stream(beanNames).forEach(LOGGER::info);
        };
    }
}
