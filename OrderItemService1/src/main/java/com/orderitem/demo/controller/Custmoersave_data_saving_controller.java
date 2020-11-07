package com.orderitem.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.orderitem.demo.model.CPlanNumber;
import com.orderitem.demo.model.CustmoerData;
import com.orderitem.demo.repo.CPlanNumberRepo;
import com.orderitem.demo.repo.CustmerSaveDataRepo;
import com.orderitem.demo.validator.Custmerdata_validation;

@RestController
public class Custmoersave_data_saving_controller {
	 
	@Autowired
	private CustmerSaveDataRepo custmersave;

	@Autowired
	private Custmerdata_validation prv; 
	
	
	@Autowired
	private CPlanNumberRepo cplanrepo;
	

	@InitBinder
	public void init(WebDataBinder web)
	{
		 
		  web.addValidators(prv);
		
		
	}
	

	@RequestMapping(method = RequestMethod.POST, value = "/savecustomer")
	public ResponseEntity<CustmoerData> postorderservice(@RequestBody CustmoerData data1) {

		CustmoerData response = custmersave.save(data1);

		ResponseEntity<CustmoerData> a = new ResponseEntity<CustmoerData>(response, HttpStatus.CREATED);

		return a;
	}
 
	
	@RequestMapping(method = RequestMethod.POST, value = "/savingcustomerplanandnumber")
	public String postorderservice(@RequestBody CPlanNumber data1,HttpSession session) {
		//getting custmer id from seesion
		Integer custmer_id=(Integer)session.getAttribute("userid");
		//mapping custmerid with cplan number
		data1.setCustid(custmer_id);
		//saving c paln data
		CPlanNumber response = cplanrepo.save(data1);

		//ResponseEntity<CPlanNumber> a = new ResponseEntity<CPlanNumber>(response, HttpStatus.CREATED);
		
		String cplannumber_trackingid="Successfulley submited.For tracking use this "+response.getCplannumberid()+"";

		return cplannumber_trackingid;
	
 
	}
	

}