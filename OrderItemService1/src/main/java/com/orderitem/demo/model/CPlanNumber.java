package com.orderitem.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CPlanNumber {
	
	 @Id  
	 @GeneratedValue(strategy=GenerationType.AUTO) 
	 
	private Integer cplannumberid;
	private Integer custid;
	private String custmerplan;
	private Integer number;
	 
	 
	 
	 
	   
	 
	 
	
	

}
