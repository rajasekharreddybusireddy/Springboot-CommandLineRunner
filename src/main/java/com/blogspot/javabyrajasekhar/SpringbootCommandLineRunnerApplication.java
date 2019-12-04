package com.blogspot.javabyrajasekhar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootCommandLineRunnerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCommandLineRunnerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("SpringbootCommandLineRunnerApplication run method");
	}

}
