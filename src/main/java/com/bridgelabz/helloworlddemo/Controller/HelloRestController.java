package com.bridgelabz.helloworlddemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.helloworlddemo.Model.User;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
	@RequestMapping(value= {"","/","/home"})
	
	public String sayHello() {
		return "Hello from BridgeLabz";
	}
	@RequestMapping(value= {"/query"},method = RequestMethod.GET)
	public String sayHello1(@RequestParam(value="fName")String fName,@RequestParam(value="lName")String lName) {
		return "Hello " +fName+ " " +lName+ "!";
	}
	@GetMapping("/param/{name}")
	public String sayHelloParam(@PathVariable String name) {
		return  "Hello " +name+ "!"; 
	}
	@PostMapping("/post")
	public String sayHello(@RequestBody User user) {
		return "Hello " +user.getFirstName() +" "+ user.getLastName() +"!";
	}
	@PutMapping("/put/{firstName}")
	public String sayHello(@PathVariable String firstName,@RequestParam(value ="lastName") String lastName) {
		return "Hello " +firstName+ " " +lastName+ "!";
	}
} 

