package com.ciq.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingEx {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingEx.class);

	@GetMapping("/map")
	public String main() {
		LOGGER.debug("it impelement the debug");
		LOGGER.error("it impelement the error");
		LOGGER.hashCode();
		LOGGER.warn("it impelement the warn");
		LOGGER.info("it impelement the info");
		return "main";

	}

}
