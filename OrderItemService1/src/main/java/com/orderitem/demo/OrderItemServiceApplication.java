package com.orderitem.demo;

import java.sql.SQLException;

import org.h2.tools.Server;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

 

@SpringBootApplication
//@EnableDiscoveryClient
public class OrderItemServiceApplication {
	
 

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(OrderItemServiceApplication.class, args);
		 
	
	 
    }
	
	
 
}
