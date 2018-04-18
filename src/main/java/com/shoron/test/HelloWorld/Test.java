package com.shoron.test.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@GetMapping("/test")
	public String testService(){
		return "this is my project";
	}
}
