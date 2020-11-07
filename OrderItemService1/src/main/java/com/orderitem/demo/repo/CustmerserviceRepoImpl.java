package com.orderitem.demo.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.orderitem.demo.model.CustmoerData;
import com.orderitem.demo.model.Employee;
@Repository
@Transactional
public class CustmerserviceRepoImpl implements CustmerServiceRepo {

	@PersistenceContext
    private EntityManager entityManager;
    
 
	 
	
	
 
	
	 


	@Override
	public CustmoerData getCustemrData(String emailadress) {
		// TODO Auto-generated method stub
		
		//entityManager.createQuery(qlString)
		return null;
	}
	
	
	
	
	
}
