package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestfulWebServicesApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(RestfulWebServicesApplication.class, args);

		CustomerService cs = context.getBean(CustomerService.class);

		System.out.println(cs.callCustomerCare());
	}
}


//  <input [(ngModel)]="email" name="email" required>