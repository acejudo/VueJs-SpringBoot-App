package com.acejudo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.acejudo.services.Greeting;

@RestController
public class GreetingController {
	
	private final AtomicLong counter = new AtomicLong();

	@Autowired
	Greeting greeting;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return greeting.sayHello(counter.incrementAndGet(), name);
	}
}
