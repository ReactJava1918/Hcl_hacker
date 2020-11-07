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

import com.orderitem.demo.custom_Exception.ProductNotfoundException;
import com.orderitem.demo.errormodel.ApiError;



//@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
public class ApiErrorHandler    {
	
	
	 // @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	  @ExceptionHandler(MethodArgumentNotValidException.class)
	  public ResponseEntity<List<ApiError > > handleValidationExceptions(
	    MethodArgumentNotValidException ex) {
		//  System.out.println("control coming to here............");
		  List<ApiError> apierror=new ArrayList<ApiError>();
		  
	    //  Map<String, String> errors = new HashMap<String, String>();
	      ex.getBindingResult().getAllErrors().forEach((error) -> {
	    	  ApiError a1 =new ApiError();
	          String fieldName = ((FieldError) error).getField();
	          String errorMessage = error.getDefaultMessage();
	          a1.setFeildname(fieldName);
	          a1.setErrormessage(errorMessage);
	          a1.setStatuscode(500);
	          apierror.add(a1);
	        //  errors.put(fieldName, errorMessage);
	      });
	      
	      ResponseEntity<List<ApiError > > errors=new  ResponseEntity<List<ApiError > >(apierror,HttpStatus.ACCEPTED);
	      return errors;
	  }
	  
	  
	  
	  //ProductNotfoundException();
	  
	  
	 // @ResponseStatus(HttpStatus.NOT_FOUND)
	  @ExceptionHandler(ProductNotfoundException.class)
	  public ResponseEntity<String> productnotfound(){
	     
		  ResponseEntity<String> resp2=new ResponseEntity<String>("product you are searching  is not avialble",HttpStatus.ACCEPTED);
	       
	        //  errors.put("message","product you are searching  is not avialble");
	       
	      return resp2;
	  }
	 
}
