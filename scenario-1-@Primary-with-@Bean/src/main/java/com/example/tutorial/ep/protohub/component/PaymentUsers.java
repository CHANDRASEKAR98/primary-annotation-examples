package com.example.tutorial.ep.protohub.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PaymentUsers {
	
	@Bean
	public Googlepay tonyPayment() {
		return new Googlepay("Tony stark payment");
	}
	
	@Bean
	@Primary
	public Googlepay stevePayment() {
		return new Googlepay("Steve Rogers payment");
	}
	
	@Bean
	public Googlepay brucePayment() {
		return new Googlepay("The Hulk payment");
	}

}
