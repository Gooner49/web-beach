package com.example.demo;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.*;

@Service
public class CustomerService
{
	List<Customer> listCust = new ArrayList<>(); 
	CustRepo custrepo1;
    public CustomerService () 
	{
			System.out.println("Service layer Sankalan created");
			listCust.add(new Customer(12,"Ashley","desc","kol"));
			listCust.add(new Customer(11,"Bradey","desc1","ko1l"));
	}
	public List<Customer> viewAll()
	{
		List<Customer> listCust1 = new ArrayList<Customer>(); ;
		custrepo1.findAll().forEach(listCust1::add);
		System.out.println(listCust1);
        return listCust;
	} 

	
}