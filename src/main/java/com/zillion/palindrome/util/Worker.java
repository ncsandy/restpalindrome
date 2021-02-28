package com.zillion.palindrome.util;

import com.zillion.palindrome.model.Users;
import org.apache.catalina.User;

public class Worker {


public Users findUser(Users [] userList, String userId){

    //User to return
    Users foundUser = null;

    //we loop through and look for the IDs from the array
    for(Users users: userList){
        if(users.getId().equals(userId)){
            foundUser = users;
            break;
        }
    }

    return foundUser;
}




}
