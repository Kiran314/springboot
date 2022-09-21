package com.training.soapexample.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
public class SoapConfig extends WsConfigurerAdapter {

	@Bean
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema xsdSchema) {
		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		definition.setPortTypeName("CustomerPort");
		definition.setLocationUri("/service/customer");
		definition.setTargetNamespace("com.test.customer");

		definition.setSchema(xsdSchema);

		return definition;

	}

	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> servletRegistrationBean(ApplicationContext context) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(context);
		servlet.setTransformWsdlLocations(true);

		return new ServletRegistrationBean<MessageDispatcherServlet>(servlet, "/service/*");

	}

	@Bean
	public XsdSchema xsdSchema() {
		return new SimpleXsdSchema(new ClassPathResource("customer.xsd"));
	}

}
