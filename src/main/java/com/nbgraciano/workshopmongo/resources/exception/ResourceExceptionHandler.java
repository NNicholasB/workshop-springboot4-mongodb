package com.nbgraciano.workshopmongo.resources.exception;

import com.nbgraciano.workshopmongo.services.exception.ObjNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjNotFoundException.class)
public ResponseEntity<StandardError>  objNotFound(ObjNotFoundException e, HttpServletRequest request){
    HttpStatus status=HttpStatus.NOT_FOUND;
    StandardError err=new StandardError(System.currentTimeMillis(),status.value(),"Not found",e.getMessage(),request.getRequestURI());
return ResponseEntity.status(status).body(err);
}


}
