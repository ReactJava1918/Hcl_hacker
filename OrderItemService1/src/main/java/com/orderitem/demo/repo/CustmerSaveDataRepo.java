package com.orderitem.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderitem.demo.model.CustmoerData;

/* Developed by siva reddy
 * To save data of customer
 */

import com.orderitem.demo.model.OrderItem;
@Repository
public interface CustmerSaveDataRepo extends JpaRepository<OrderItem,Integer> {
	
	 
	public CustmoerData  save(CustmoerData entity);
	 
	 

}
