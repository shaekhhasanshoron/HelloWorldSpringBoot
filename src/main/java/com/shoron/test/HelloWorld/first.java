package com.shoron.test.HelloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class first {
	
	@GetMapping("/")
	public String model(){
		return "First";
	}
}
