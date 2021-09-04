package com.example.demo.exceptions;


@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFound extends  Exception{
    public ResourceNotFound (){
        super();
    }

    public ResourceNotFound(String message, Throwable cause){
        super(message, cause);
    }

    public ResourceNotFound(String message){
        super(message);
    }
}

