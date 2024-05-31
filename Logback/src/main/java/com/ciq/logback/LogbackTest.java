package com.ciq.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {
	private static final Logger logger = LoggerFactory.getLogger(LogbackTest.class);

	public static void main(String[] args) {
		logger.info("This is an info message");
		logger.debug("This is a debug message");
		logger.error("This is an error message");
		try {
			// Simulate an exception
			throw new Exception("Sample exception");
		} catch (Exception e) {
			logger.error("Exception occurred", e);
		}

	}
}
