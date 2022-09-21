package com.training.soapclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
public class SoapClientConfig {
	@Bean
	public WebServiceTemplate webServiceTemplate(Jaxb2Marshaller marshaller) {
		WebServiceTemplate template = new WebServiceTemplate(marshaller, marshaller);

		return template;
	}

	@Bean
	public Jaxb2Marshaller jaxb2Marshaller() {
		Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
		jaxb2Marshaller.setPackagesToScan("com.training.soapclient.binding");
		return jaxb2Marshaller;
	}

}
