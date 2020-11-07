package com.orderitem.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderitem.demo.model.CustmoerData;

/* Developed by siva reddy
 * To save data of customer
 */

import com.orderitem.demo.model.OrderItem;
@Repository
public interface CustmerSaveDataRepo extends JpaRepository<CustmoerData,Integer> {
	
	
	public CustmoerData  save(CustmoerData entity);
	public Optional<CustmoerData> findByCust_emailadress(String emailadress);
	/*public Optional<OrderItem> findByProductName(String productname);

	 
	 private String custname;
	 private String cust_emailadress;
	 private String cust_pan;
	 */
	 
	 

}
