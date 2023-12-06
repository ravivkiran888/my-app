package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.stereotype.Component;

@Component
public class TruckEngine implements VechileEngine{

	@Override
	public void ready() {
		
		System.out.println("TruckEngine is ready");
	}

}
