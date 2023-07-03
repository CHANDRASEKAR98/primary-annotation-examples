package com.example.tutorial.ep.protohub.component;

public class Googlepay {
	
	private String paymentUser;

	public Googlepay(String paymentUser) {
		this.paymentUser = paymentUser;
	}
	
	@Override
	public String toString() {
		return paymentUser;
	}

}
