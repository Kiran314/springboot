package com.training.soapclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.training.soapclient.binding.CustomerRequest;
import com.training.soapclient.binding.CustomerResponse;

@Service
public class ClientService {
	@Autowired
	private WebServiceTemplate template;

	public CustomerResponse getCustomer(CustomerRequest request) {
		CustomerResponse response = (CustomerResponse) template
				.marshalSendAndReceive("http://localhost:8080/service/customer", request);

		return response;
	}
}
