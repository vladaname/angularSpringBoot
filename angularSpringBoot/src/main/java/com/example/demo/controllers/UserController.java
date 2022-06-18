package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserIdDto;
import com.example.demo.dto.UserRegistrationDto;
import com.example.demo.model.Angularuser;
import com.example.demo.service.UserService;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/registration")
	public String registration(@RequestBody Angularuser userReg) {
		Angularuser createUser = userService.registration(userReg);
		if(createUser != null) {
			return "You are registred!";
		}
		else {
			return "Registration faild!";
		}	
	}
	
	@GetMapping("/findByEmail/{email}")
	public List<Angularuser> findByEmail(@PathVariable("email") String email) {
		List<Angularuser> getUserByEmail = userService.getByEmail(email);
		return getUserByEmail;
	}
	
	@GetMapping("/findAllUser")
	public List<Angularuser> findAllUser(){
		List<Angularuser> findAll = userService.findAllUser();
		return findAll;
	}
	@DeleteMapping("/deleteUser/{idAngularUser}")
	public List<Angularuser> deleteUser(@PathVariable("idAngularUser") int idAngularUser) {
		boolean deleteUserById = userService.deleteUserById(idAngularUser);
		if(deleteUserById) {
		return userService.findAllUser();
		}
		return null;
	}
	

}
