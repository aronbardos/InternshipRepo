package com.evozon.factories;

import com.evozon.entities.User;
import com.evozon.utils.FieldGenerator;

public class UserFactory {
    public static User generateUser(){
        User user = new User();
        user.setFirstname(FieldGenerator.generateStringValue(10, FieldGenerator.TypeOfString.ALPHANUMERIC));
        user.setLastname(FieldGenerator.generateStringValue(10, FieldGenerator.TypeOfString.ALPHANUMERIC));
        user.setEmail(FieldGenerator.generateStringValue(10, FieldGenerator.TypeOfString.ALPHANUMERIC) + "@mailinator.com");
        user.setPassword(FieldGenerator.generateStringValue(10, FieldGenerator.TypeOfString.ALPHANUMERIC));

        return user;
    }
}
