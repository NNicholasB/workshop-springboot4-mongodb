package com.nbgraciano.workshopmongo.services.exception;

public class ObjNotFoundException extends RuntimeException{
    public ObjNotFoundException(String msg){
        super(msg);
    }
}
