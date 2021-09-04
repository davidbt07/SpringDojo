package com.example.demo.exceptions;

@ResponseStatus(HttpStatus.IM_USED)
public class ResourceAlreadyFound extends  Exception {
    public ResourceAlreadyFound(){
        super();
    }

    public ResourceAlreadyFound(String message, Throwable cause){
        super(message, cause);
    }

    public ResourceAlreadyFound(String message){
        super(message);
    }
}

