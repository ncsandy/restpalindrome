package com.zillion.palindrome;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.zillion.palindrome.util.PaldindromeSolver;
import com.zillion.palindrome.util.Worker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
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
	public PaldindromeSolver solver(){
		return new PaldindromeSolver();
	}

	public static void main(String[] args) {
		SpringApplication.run(PalindromeApplication.class, args);
	}

}
