package me.rafikBoullaft.resume.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rafikBoullaft {
	//@CrossOrigin(origins="http://localhost:8080/")
	@RequestMapping("/")
	public String homme() {
		return "Rafik Boullaft";
	}
	

}
