package com.orderitem.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.orderitem.demo.model.CustmoerData;
import com.orderitem.demo.model.OrderServiceHistory;
import com.orderitem.demo.repo.CustmerSaveDataRepo;

@RestController
public class Custmoersave_data_saving_controller {
	 
	@Autowired
	private CustmerSaveDataRepo custmersave;

	 

	@RequestMapping(method = RequestMethod.POST, value = "/savecustomer")
	public ResponseEntity<CustmoerData> postorderservice(@RequestBody CustmoerData data1) {

		CustmoerData response = custmersave.save(data1);

		ResponseEntity<CustmoerData> a = new ResponseEntity<CustmoerData>(response, HttpStatus.CREATED);

		return a;
	}
 

}