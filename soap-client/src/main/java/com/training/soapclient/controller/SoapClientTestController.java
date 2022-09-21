package com.training.soapclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.soapclient.binding.CustomerRequest;
import com.training.soapclient.binding.CustomerResponse;
import com.training.soapclient.service.ClientService;

@RestController
public class SoapClientTestController {
	@Autowired
	private ClientService service;
	@PostMapping("/customer")
	public CustomerResponse  getCustomer(@RequestBody CustomerRequest request) {
		return service.getCustomer(request);
	}

}
