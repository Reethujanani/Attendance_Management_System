package com.example.attendance;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AttendanceMgmtApplication {
	private static final Logger LOGGER= (Logger) LoggerFactory.getLogger(AttendanceMgmtApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(AttendanceMgmtApplication.class, args);

		LOGGER.info("Welcome to attendance management");
		LOGGER.info("Attendance saved successfully");
		LOGGER.info("Attendance updated successfully");
		LOGGER.info("disease saved successfully");
		LOGGER.info("doctor updated successfully");
		LOGGER.info("doctor saved successfully");
		LOGGER.info("patient saved successfully");
		LOGGER.info("patient deleted successfully");

	}

}
