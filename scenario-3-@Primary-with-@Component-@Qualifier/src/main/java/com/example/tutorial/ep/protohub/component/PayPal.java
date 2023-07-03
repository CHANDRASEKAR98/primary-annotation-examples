package com.example.tutorial.ep.protohub.component;

import org.springframework.stereotype.Component;

@Component
public class PayPal implements PaymentApp {

	@Override
	public String getAPIInfo() {
		return "Pay Pal Transaction";
	}

}
