package com.db.Security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.db.Security")
public class SbBasicSecuirtyExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbBasicSecuirtyExApplication.class, args);
	}

}
