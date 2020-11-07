package com.orderitem.demo.exception_handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.orderitem.demo.custom_Exception.PanNumberRequiredException;
import com.orderitem.demo.custom_Exception.ProductNotfoundException;
import com.orderitem.demo.errormodel.ApiError;



//@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
public class ApiErrorHandler    {
	
	
	  
	  
	  //ProductNotfoundException();
	  
	  
	 // @ResponseStatus(HttpStatus.NOT_FOUND)
	  @ExceptionHandler(PanNumberRequiredException.class)
	  public ResponseEntity<String> productnotfound(){
	     
		  ResponseEntity<String> resp2=new ResponseEntity<String>("PAN Number IS MUST!!!!",HttpStatus.INTERNAL_SERVER_ERROR);
	       
	        //  errors.put("message","product you are searching  is not avialble");
	       
	      return resp2;
	  }
	 
}
