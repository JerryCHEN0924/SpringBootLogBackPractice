package com.idv.hanjichen.software.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogApplication {
	private static final Logger logger = LoggerFactory.getLogger(LogApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(LogApplication.class, args);
		
		logger.debug("Debug2 訊息測試");
        logger.info("Info2 訊息測試");
        logger.warn("Warning2 訊息測試");
        logger.error("Error2 訊息測試");
	}

}
