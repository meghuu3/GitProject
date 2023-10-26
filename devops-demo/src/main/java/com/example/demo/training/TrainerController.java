package com.example.demo.training;

import org.springframework.web.bind.annotation.GetMapping;

public class TrainerController {

	@GetMapping(path="/bye")
	public String hello(){
		return "Message from Trainer";
	}
}
