package com.oustadi.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "login")
public class LoginController {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	
	@GetMapping("logs")
	private String getlogs() {
		String value = " task number1";
		LOGGER.trace("doStuff needed more information - {}", value);
		LOGGER.debug("doStuff needed to debug - {}", value);
		LOGGER.info("doStuff took input - {}", value);
		LOGGER.warn("doStuff needed to warn - {}", value);
		LOGGER.error("doStuff encountered an error with value - {}", value);
		return "this is a test";
	}

}
