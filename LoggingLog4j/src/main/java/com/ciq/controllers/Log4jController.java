package com.ciq.controllers;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class Log4jController {
	Logger logg = LoggerFactory.getLogger(Log4jController.class);

	@GetMapping("/lombok")
	public String indexa() {
		logg.trace("A TRACE Message");
		logg.debug("A DEBUG Message");
		logg.info("An INFO Message");
		logg.warn("A WARN Message");
		logg.error("An ERROR Message");

		return "indexa, indHowdy! Check out the Logs to see the output...";
	}
}
