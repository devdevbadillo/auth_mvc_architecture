package com.david.auth_mvc.common.exceptions.credential;

public class UserNotFoundException extends Exception{

    public UserNotFoundException(String message) {
        super(message);
    }
}
