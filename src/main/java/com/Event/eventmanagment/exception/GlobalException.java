package com.Event.eventmanagment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
	@ExceptionHandler(InvalidNameException.class)
	public ResponseEntity<String> InvalidName(InvalidNameException ex){
	return new ResponseEntity<>(ex.getMessage(),HttpStatus.BAD_REQUEST);
	}
}
