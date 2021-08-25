package com.tcs.springbootdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication
public class SpringbootDemoApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringbootDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

	@PostMapping("/user")
	private void saveUser(@RequestBody User user) {
		logger.debug(user.getFirstName());
	}
}