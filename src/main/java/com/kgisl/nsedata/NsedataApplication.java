package com.kgisl.nsedata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NsedataApplication {

	public static void main(String[] args) {
		SpringApplication.run(NsedataApplication.class, args);
	}
	// @Bean
	// public ServletRegistrationBean h2servletRegistration() {
	// 	ServletRegistrationBean registration = new ServletRegistrationBean(new WebServlet());
	// 	registration.addUrlMappings("/console/*");
	// 	return registration;
	// }
}
