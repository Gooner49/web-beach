package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.*;

@Service
public class CustomerService
{
	List<Customer> listCust = new ArrayList<>(); 

	@Autowired
	CustRepo custrepo1;

    public CustomerService () 
	{
			System.out.println("Service layer Sankalan created");
			//listCust.add(new Customer(12,"Ashley","desc","kol"));
			//listCust.add(new Customer(11,"Bradey","desc1","ko1l"));
	}
	public List<Customer> viewAll()
	{
	//	List<Customer> listCust1 = new ArrayList<Customer>(); ;
	    try {
			listCust.clear();
			custrepo1.findAll().forEach(listCust::add);;
			//groceryItemRepo.findAll().forEach(item -> System.out.println(getItemDetails(item)));
		}
		catch(NullPointerException nlx){
			System.out.println("Null pointer exception detected" +nlx.toString());
			nlx.printStackTrace();
		}
		
		finally {
					        
		}	
		return listCust;		
	} 

	
}