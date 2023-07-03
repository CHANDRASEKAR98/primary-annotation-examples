package com.example.tutorial.ep.protohub.component;

import org.springframework.stereotype.Component;

@Component
public class Googlepay implements PaymentApp {

	@Override
	public String getAPIInfo() {
		return "Google pay Transaction";
	}

}
