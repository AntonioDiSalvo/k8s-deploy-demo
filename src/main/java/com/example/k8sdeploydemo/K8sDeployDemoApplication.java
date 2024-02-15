package com.example.k8sdeploydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class K8sDeployDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8sDeployDemoApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {

		System.out.println("foobar");
		return "Ciao Mondo da K8s!! + readiness probe attiva + skaffold!!";
	}
}