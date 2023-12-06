package com.in28minutes.rest.webservices.restfulwebservices;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webservices.restfulwebservices.domain.LibraryEvent;

@RestController

public class HelloWorldController {
	
	
	 @PostMapping("/v1/libraryevent")
	    public ResponseEntity<LibraryEvent> postLibraryEvent(
	            @RequestBody LibraryEvent libraryEvent
	    ){

		 System.out.println("Libray Event is "+libraryEvent);
		 
	        return ResponseEntity.status(HttpStatus.CREATED).body(libraryEvent);
	    }
	
}
