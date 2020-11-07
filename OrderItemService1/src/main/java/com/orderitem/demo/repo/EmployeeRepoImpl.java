package com.orderitem.demo.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.orderitem.demo.model.Employee;
@Repository
@Transactional
public class EmployeeRepoImpl implements EmployeeRepo {

	@PersistenceContext
    private EntityManager entityManager;
    
 
	@Override
	 public Employee save(Employee e) {
		
		entityManager.persist(e);
		// TODO Auto-generated method stub
		return e;
	}
	
	
	
	public Employee getEmployee(int id)
	{
		Employee s=entityManager.find(Employee.class,id);
		
		return s;
	}

	
	
	public Employee updateEmployee(int id)
	{
		Employee s=entityManager.find(Employee.class,id);
		 s.setEmpname("hellooooooooohhhhhhoooo");
		// entityManager.persist(s);
		return entityManager.find(Employee.class,id);
	}
	
	
	
	
	
}
