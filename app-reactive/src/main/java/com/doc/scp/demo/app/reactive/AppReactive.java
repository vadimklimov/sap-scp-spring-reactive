package com.doc.scp.demo.app.reactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class AppReactive {

	public static void main(String[] args) {
		SpringApplication.run(AppReactive.class, args);
	}
}
