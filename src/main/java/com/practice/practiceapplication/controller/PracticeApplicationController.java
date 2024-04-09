package com.practice.practiceapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeApplicationController {
	@GetMapping(value = "/display")
	public String display() {
		return "Practice application is running";
	}
}
