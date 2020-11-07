package com.orderitem.demo;

import java.sql.SQLException;

import org.h2.tools.Server;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.orderitem.demo.dto.Employeedto;
import com.orderitem.demo.model.Employee;
import com.orderitem.demo.repo.EmployeeRepoImpl;
import com.orderitem.demo.repo.OrderItemRepo;
import com.orderitem.demo.repo.OrderServiceRepo;

@SpringBootApplication
//@EnableDiscoveryClient
public class OrderItemServiceApplication {
	

	@Autowired
	private OrderItemRepo orderitemrepo;
	
	@Autowired
	private OrderServiceRepo orderservicerepo;

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(OrderItemServiceApplication.class, args);
		EmployeeRepoImpl sml	=run.getBean(EmployeeRepoImpl.class);
		for(int i=0;i<100;i++)
		{
		
		Employee e1=new Employee();
		e1.setEmpadress("infosys");
		e1.setEmpname("siva");
		sml.save(e1);
		}
	System.out.println("successfully saved................");
	
	
	Employee e=sml.getEmployee(5);
	System.out.println("before update----------------------");
	
System.out.println(e.getEmpname() +e.getEmpid() +e.getEmpadress());
	Employee e2=sml.updateEmployee(5);
	System.out.println("After  update----------------------");
	System.out.println(e2.getEmpname() +e2.getEmpid() +e2.getEmpadress());
	Employeedto dtomodel=new  Employeedto();
	System.out.println("After copying data to dto   ----------------------");
	
	BeanUtils.copyProperties(e2,dtomodel);
	System.out.println(dtomodel.getEmpname() +dtomodel.getEmpid() +dtomodel.getEmpadress());
	
	
	 
	}
	
	
	
	@Bean(initMethod = "start", destroyMethod = "stop")
    public Server inMemoryH2DatabaseServer() throws SQLException {
        return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "8762");
    }
	
	
	/* 
	public void postData() {
		
		 
		OrderItem data =new OrderItem();
		data.setProductCode("saoapsiva1");
		//data.setProductid(1);
		data.setProductName("soap");
		data.setProductQuantity(1);
	 

		OrderItem response = orderitemrepo.save(data);
		
		System.out.println("data successfully saved.........");
	 
	}
	
	
	public void postDataorderservice() {
		ArrayList<OrderServiceItem> data2 =new ArrayList<OrderServiceItem>();
		 
		OrderServiceHistory data =new OrderServiceHistory();
		
		data.setCustomerName("siva");
		data.setShippingAddress("hyd");
		data.setTotal(100);
		 OrderServiceItem a11=new OrderServiceItem();
		 a11.setProductid(1);
		 data2.add(a11);
		 OrderServiceItem a12=new OrderServiceItem();
		 a12.setProductid(2);
		data2.add(a12);
		data.setServiceitem(data2);
		
		 orderservicerepo.save(data);  
		     
	
		
		System.out.println("data successfully saved.........");
	 
	}
*/
}
