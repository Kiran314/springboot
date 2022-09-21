package com.training.springbootmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.training.springbootmvc.model.Customer;
import com.training.springbootmvc.repository.CustomerRepository;

@Controller
public class RegistrationController {
	@Autowired
	private CustomerRepository repository;
	@Autowired
	private PasswordEncoder encoder;

	@GetMapping("/registration")
	public String register() {
		return "registration";
	}

	@PostMapping("/registration")
	public String registration(@ModelAttribute Customer customer) {

		customer.setPassword(encoder.encode(customer.getPassword()));

		customer = repository.save(customer);
		System.out.println("Registered successfully");
		return "success";
	}
}
