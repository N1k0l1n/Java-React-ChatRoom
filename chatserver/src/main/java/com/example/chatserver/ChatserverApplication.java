package com.example.chatserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication

public class ChatserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatserverApplication.class, args);
	}

}
