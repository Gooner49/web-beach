package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.data.mongodb.core.MongoTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.*;

@Service
public class CustomerService
{
	List<Customer> listCust = new ArrayList<>(); 
	List<Customer> listCust_loc = new ArrayList<>(); 
	

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

	public void AddCust (String ps)
	{
		System.out.println("Starting to add customer  " +ps);
		
		ObjectMapper objectMapper1 = new ObjectMapper();
		try {
		Customer_UI cust_add = objectMapper1.readValue(ps, Customer_UI.class);
        System.out.println("Adding customer with title :  " +cust_add.gettitle());
		Customer cust_add_db = new Customer(cust_add.gettitle(), cust_add.getdescription(), cust_add.getlocation());
		custrepo1.save(cust_add_db);
		} 
		catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<String> viewonlyDept ()
	{
		//List<String> listCust = new ArrayList<String>(); ;
		List<String> listLoc = new ArrayList<>(); 
		try {
				listCust_loc.clear();
				custrepo1.findAll().forEach(listCust_loc::add);
				//groceryItemRepo.findAll().forEach(item -> System.out.println(getItemDetails(item)));
			}
			catch(NullPointerException nlx){
				System.out.println("Null pointer exception detected" +nlx.toString());
				nlx.printStackTrace();
			}

			finally 
			{	
				listCust_loc.forEach ((n)  ->
				                           { 
												String s1 = n.description;
												listLoc.add(s1);
					                           // System.out.println(n); 
											   // System.out.println(n);
				                           } 
				 );				
				//Numbers.forEach((n) -> System.out.println(n));

			}	
		return listLoc;		
	}	
	public void updateCategory ()
	{
		MongoTemplate mt;
		System.out.println("n");
		mt.findOne(null, null)
	}	
}