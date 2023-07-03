package com.example.tutorial.ep.protohub.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PayPal implements PaymentApp {

	@Override
	public String getAPIInfo() {
		return "Pay Pal Transaction";
	}

}
