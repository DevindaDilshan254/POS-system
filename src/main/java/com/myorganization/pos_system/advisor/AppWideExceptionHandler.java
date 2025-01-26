package com.myorganization.pos_system.advisor;

import com.myorganization.pos_system.exception.ErrorException;
import com.myorganization.pos_system.exception.NotFoundException;
import com.myorganization.pos_system.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppWideExceptionHandler {

    @ExceptionHandler(NotFoundException.class) //Run when throw NotFoundException class ,Any class extend from RuntimeException,Exception or Throwable
    ResponseEntity<StandardResponse> handleNotFoundException(NotFoundException e){//pass the NotFoundException class object(e),e.getMessage()=given message to supper class
        return new ResponseEntity<StandardResponse>(new StandardResponse(400,"Error",e.getMessage()), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(ErrorException.class) //Run when throw ErrorException class
    ResponseEntity<StandardResponse> handleErrorException(ErrorException e){
        return new ResponseEntity<StandardResponse>(new StandardResponse(401,"Error",e.getMessage()), HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(Exception.class)
    ResponseEntity<StandardResponse> handleAnyException(Exception e){
        return new ResponseEntity<StandardResponse>(new StandardResponse(402,"Error",e.getMessage()), HttpStatus.NO_CONTENT);
    }

//    throw new ErrorException("not active items found"); in service
// => handleErrorException(ErrorException e)
}
