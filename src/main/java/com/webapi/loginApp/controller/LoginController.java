package com.webapi.loginApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapi.loginApp.model.LoginRequest;

@RestController
@RequestMapping("/login")
@CrossOrigin
public class LoginController {

	@PostMapping
	public ResponseEntity login(@RequestBody LoginRequest request) {
		System.out.println(request.toString());
		if(request.getUsername().equals("abc") && request.getPassword().equals("123")) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.FORBIDDEN);
		}
	}
}
