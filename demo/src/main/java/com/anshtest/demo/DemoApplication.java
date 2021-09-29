package com.anshtest.demo;
// Source https://www.developersoapbox.com/using-spring-boot-with-intellij-community-edition/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// Source: https://spring.io/guides/gs/spring-boot/
	@GetMapping("/*")
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public String index() {
		return "------------ Works with only /health/check -----------";
	}

	@GetMapping("/health/check")
	public String healthCheck() {
		return "------------ I AM FINE-----------------";
	}

}