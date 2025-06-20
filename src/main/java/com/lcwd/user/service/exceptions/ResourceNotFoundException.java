package com.lcwd.user.service.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    //extra properties that we want to manage
    public ResourceNotFoundException(){
        super("resource not found on server");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }
}
