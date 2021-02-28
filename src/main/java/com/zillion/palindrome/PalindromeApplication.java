package com.zillion.palindrome;

import com.zillion.palindrome.util.Worker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PalindromeApplication {

	//creating a usuable instance of the RestTemplate
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	@Bean
	public Worker worker(){
		return new Worker();
	}


	public static void main(String[] args) {
		SpringApplication.run(PalindromeApplication.class, args);
	}

}
