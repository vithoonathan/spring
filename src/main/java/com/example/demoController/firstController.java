package com.example.demoController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {
	@RequestMapping("/hello")
	public String helloMsg() {
		return "Helo world...!";
	}

}
