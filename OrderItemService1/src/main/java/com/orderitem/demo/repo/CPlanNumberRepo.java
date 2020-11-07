package com.orderitem.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderitem.demo.model.CPlanNumber;
@Repository
public interface CPlanNumberRepo extends JpaRepository<CPlanNumber,Integer> {
	
	
	 
	 
	 

}
