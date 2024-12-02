package com.example.drugiprojektmpr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class DrugiProjektMprApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrugiProjektMprApplication.class, args);
	}

}
