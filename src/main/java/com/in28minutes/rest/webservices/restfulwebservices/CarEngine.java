package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.stereotype.Component;

@Component
public class CarEngine implements VechileEngine{
	
	public void ready()
	{
		System.out.println("CarEngine is ready");
	}

}
