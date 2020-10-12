package com.to_doapp.ToDoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ToDoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoAppApplication.class, args);
	}

	@GetMapping("/ToDo")
	public String wPage(@RequestParam(value = "Name", defaultValue = "Kush.Official") String name){
		return String.format("Welcome to To Do Application %s", name);
	}

}
