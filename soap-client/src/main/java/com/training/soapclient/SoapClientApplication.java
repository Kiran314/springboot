package com.training.soapclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoapClientApplication {
//	@Autowired
//	private WebServiceTemplate template;

	public static void main(String[] args) {
		SpringApplication.run(SoapClientApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//
//		CustomerRequest customerRequest = new CustomerRequest();
//		customerRequest.setId(123);
//		CustomerResponse response = (CustomerResponse) template
//				.marshalSendAndReceive("http://localhost:8080/service/customer", customerRequest);
//
//		System.out.println(response.getName());
//		System.out.println(response.getId());
//
//	}

}
