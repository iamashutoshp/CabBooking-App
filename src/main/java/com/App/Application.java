package com.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ExecuteTest executeTests=context.getBean(ExecuteTest.class);
		
//		executing sample test cases...
		executeTests.addUsers();
		executeTests.updateUsersLocation();
		executeTests.addDrivers();
		executeTests.findRide();
		executeTests.getEarnings();
		
	}

}
