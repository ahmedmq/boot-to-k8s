package com.demo.boottok8s;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootToK8sApplication {

	@Value("${message:Hello from default}")
	private String message;

	public static void main(String[] args) {
		SpringApplication.run(BootToK8sApplication.class, args);
	}

	@GetMapping("/")
	public String getMessage(){
		return message;
	}

}
