package com.example.demo.hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @RequestMapping("/greet")
    public Greeting greeting(@RequestParam(name="value",defaultValue="Aman")String value){
    	return new Greeting(counter.incrementAndGet(),String.format(template, value));
    }
}
