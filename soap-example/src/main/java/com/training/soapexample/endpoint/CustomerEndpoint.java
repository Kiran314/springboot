package com.training.soapexample.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.kiran.xml.CustomerRequest;
import com.kiran.xml.CustomerResponse;

@Endpoint
public class CustomerEndpoint {

	@PayloadRoot(namespace = "http://www.kiran.com/xml", localPart = "customerRequest")
	@ResponsePayload
	public CustomerResponse getCustomer(@RequestPayload CustomerRequest customer) {

		System.out.println("payload " + customer.getId());
		CustomerResponse cu = new CustomerResponse();
		cu.setName("Kiran");
		cu.setId(123);
		cu.setAddress("Hyd");
		return cu;
	}

}
