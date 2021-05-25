package com.restapi.msposts.exceptions;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.restapi.msposts.web.ApiError;


@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex,
			HttpHeaders headers, 
			HttpStatus status, 
			WebRequest request) {
		
		List<String> details = new ArrayList<String>();
		details = ex.getBindingResult()
				    .getFieldErrors()
					.stream()
					.map(error -> error.getObjectName()+ " : " +error.getDefaultMessage())
					.collect(Collectors.toList());
		
		ApiError err = new ApiError(LocalDateTime.now(),
				"Validation Errors" ,
				details);
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
	}
	
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<Object> handleConstraintViolationException(
			Exception ex, 
			WebRequest request) {
		
		List<String> details = new ArrayList<String>();
		details.add(ex.getMessage());
		
		ApiError err = new ApiError(
				LocalDateTime.now(), 
				"Constraint Violation" ,
				details);
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
	}
	
	@ExceptionHandler(PostNotFoundException.class)
	public ResponseEntity<Object> handleResourceNotFoundException(
			PostNotFoundException ex) {
       
		List<String> details = new ArrayList<String>();
		details.add(ex.getMessage());
		
		ApiError err = new ApiError(
				LocalDateTime.now(), 
				"Resource Not Found" ,
				details);
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}

}
