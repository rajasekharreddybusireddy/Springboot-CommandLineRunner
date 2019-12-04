package com.blogspot.javabyrajasekhar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(value=1)
@Component
public class ApplicationStartupRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ApplicationStartupRunner run method");
	}

}
