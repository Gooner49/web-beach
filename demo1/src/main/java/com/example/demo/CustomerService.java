package com.example.demo;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.*;

@Service
public class CustomerService
{
	List<Customer> listCust = new ArrayList<>(); 
    public CustomerService () 
	{
			System.out.println("Service layer created");
			listCust.add(new Customer(1,"Ashley"));
			listCust.add(new Customer(2,"Finley"));
			listCust.add(new Customer(3,"Fang"));
			listCust.add(new Customer(4,"Drey"));
	}
	public List<Customer> viewAll()
	{
       return listCust;
	} 

	
}