package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
	
	public String[] setCity() {
		return new String[] {"Chennai","Pune","Mumbai"};
	}

}
