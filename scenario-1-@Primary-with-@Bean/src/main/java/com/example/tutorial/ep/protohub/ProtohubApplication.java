package com.example.tutorial.ep.protohub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.tutorial.ep.protohub.component.Googlepay;

@SpringBootApplication
public class ProtohubApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ProtohubApplication.class, args);
		Googlepay googlepay = context.getBean(Googlepay.class);
		System.out.println(googlepay);
	}

}
