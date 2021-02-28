package com.zillion.palindrome.controllers;


import com.fasterxml.jackson.databind.node.ObjectNode;
import com.zillion.palindrome.PalindromeApplication;
import com.zillion.palindrome.model.Users;
import com.zillion.palindrome.util.PaldindromeSolver;
import com.zillion.palindrome.util.Worker;
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

    @Autowired
    Worker worker;



    @RequestMapping("/{usersId}")
    public ObjectNode getUsers(String userId, @PathVariable String usersId)  {


            //Here we are fetching the  JSON from external website
            ResponseEntity<Users[]> responseEntity =


                    restTemplate.getForEntity("https://jsonplaceholder.typicode.com/users", Users[].class);

            //and mapping to an array of Users
            Users[] usersArray = responseEntity.getBody();


           //calling function from the worker class to find a valid user.
        assert usersArray != null;
        return worker.findUser(usersArray, usersId);



    }

}
