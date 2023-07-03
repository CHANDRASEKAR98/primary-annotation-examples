package com.example.tutorial.ep.protohub.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentTestUser {
	
	@Autowired
	private PaymentApp paymentApp;
	
	public String displayPayment() {
		return paymentApp.getAPIInfo();
	}

}
