package com.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("Hello");
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ExecuteTest executeTests=context.getBean(ExecuteTest.class);
		
		executeTests.addUsers();
		executeTests.updateUsersLocation();
		
		executeTests.addDrivers();
		
	}

}
