package com.zillion.palindrome.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.zillion.palindrome.model.Users;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

public class Worker {
    //inject it here so we can use it
    @Autowired
    PaldindromeSolver solver;
    //inject it here so we can use it
    @Autowired
    ObjectMapper mapper;


    public Worker() {
    }

    public ObjectNode findUser(Users [] userList, String userId){

    //User to return
    Users foundUser = null;
    //the total palindromes
    long pCount = 0;

    //we loop through and look for the IDs from the array
    for(Users users: userList){
        if(users.getId().equals(userId)){
            //assigning it to a value
            foundUser = users;
           //here we call the solver class to get the count
            pCount = solver.stringWorker(foundUser.getName());
            //here we are setting the count property from the previous method above
            foundUser.setCount(pCount);
            //break out of loop, we don't need to go through anymore..
            break;

        }
    }


        assert foundUser != null;
        return jsonCreator(foundUser);
}

public ObjectNode jsonCreator(Users user){

      //we need this mapper to create the customer node with our info
    ObjectNode objectNode = mapper.createObjectNode();
   //populating the JSON with the name
    objectNode.put("name", user.getName());
    //population the JSON with the count
    objectNode.put("count",user.getCount());
    //return the custom node ready for deployment to the rest controller
    return objectNode;
}


}
