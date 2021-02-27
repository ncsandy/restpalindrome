package com.zillion.palindrome.controllers;


import com.zillion.palindrome.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("palindromes")
public class UserService {

    //aquiring the bean from the main class to be reused
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/{usersId}")
    public Users[] getUsers(String userId, @PathVariable String usersId)  {
        ResponseEntity<Users[]> responseEntity =
                //Here we are fetching the raw JSON
                restTemplate.getForEntity("https://jsonplaceholder.typicode.com/users", Users[].class);

                Users[] usersArray = responseEntity.getBody();

                return usersArray;


//                return Arrays.stream(usersArray)
//                        .map(Users::getName)
//                        .collect(Collectors.toList());


    }

}
