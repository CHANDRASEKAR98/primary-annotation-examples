package com.example.tutorial.ep.protohub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.tutorial.ep.protohub.component.PaymentTestUser;

@SpringBootApplication
public class ProtohubApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ProtohubApplication.class, args);
		PaymentTestUser user = context.getBean(PaymentTestUser.class);
		System.out.println(user.displayPayment());
	}

}
