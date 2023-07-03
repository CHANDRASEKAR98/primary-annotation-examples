package com.example.tutorial.ep.protohub.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentTestUser {
	
	@Autowired
	@Qualifier(value = "payPal")
	private PaymentApp paymentApp;
	
	public String displayPayment() {
		return paymentApp.getAPIInfo();
	}

}
