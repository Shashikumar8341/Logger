package com.ciq.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

	private static final Logger logger = LoggerFactory.getLogger(LogController.class);

	@GetMapping("/find")
	public String find() {
		logger.debug("A debug message");
		logger.info("An info message");
		logger.warn("A warn message");
		logger.error("An error message");
		return "find, World!";
	}

}
