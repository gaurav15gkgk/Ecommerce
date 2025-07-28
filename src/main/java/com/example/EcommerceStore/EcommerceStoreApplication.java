package com.example.EcommerceStore;

import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvEntry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceStoreApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure()
						.load();
		dotenv.entries().forEach(e -> System.setProperty(e.getKey(), e.getValue()));


		SpringApplication.run(EcommerceStoreApplication.class, args);
	}

}
