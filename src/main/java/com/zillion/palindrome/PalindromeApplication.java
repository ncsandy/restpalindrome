package com.zillion.palindrome;

import com.zillion.palindrome.controllers.UserService;
import com.zillion.palindrome.util.PalindromeSolver;
import com.zillion.palindrome.util.Worker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackageClasses = UserService.class)
public class PalindromeApplication {

	//creating our beans for reuse
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	@Bean
	public Worker worker(){
		return new Worker();
	}
	@Bean
	public PalindromeSolver solver(){
		return new PalindromeSolver();
	}

	public static void main(String[] args) {
		SpringApplication.run(PalindromeApplication.class, args);
	}

}
