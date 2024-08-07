package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.data.mongodb.core.MongoTemplate;
//org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

@Service
public class CustomerService
{
	List<Customer> listCust = new ArrayList<>(); 
	List<Customer> listCust_loc = new ArrayList<>(); 

	//@Autowired
	//private MongoTemplate mt1 ;
	//AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

	
	//@Autowired
	//CustRepo custrepo1;
    
    @Autowired
    CustRepo custrepo1;


    public CustomerService () 
	{
				
	}


	public String viewAll_str()
	{
		return "listCust _aclient";		
	} 



	public List<Customer> viewAll()
	{
	    try 
		{
    		listCust.clear();
   			custrepo1.findAll().forEach(listCust::add);;
			//groceryItemRepo.findAll().forEach(item -> System.out.println(getItemDetails(item)));
		}
		catch(NullPointerException nlx)
		{
			System.out.println("Null pointer exception detected when accessing database" +nlx.toString());
			nlx.printStackTrace();
		}
		finally 
		{
					        
		}	
		return listCust;		
	} 

	public void AddCust (String ps)
	{
		/*System.out.println("Starting to add customer  " +ps);s
		
		ObjectMapper objectMapper1 = new ObjectMapper();
		try {
				Customer_UI cust_add = objectMapper1.readValue(ps, Customer_UI.class);
				System.out.println("Adding customer with title :  " +cust_add.gettitle());
				Customer cust_add_db = new Customer(cust_add.gettitle(), cust_add.getdescription(), cust_add.getlocation());
				custrepo1.save(cust_add_db);
		} 
		catch (JsonProcessingException e) 
		{
			throw new RuntimeException(e);
		}*/
	}

	public void AddCust (String desc , String location , String title)
	{
		
		String Str2 = "default";
		
		/*System.out.println("Starting to add customer  " +ps);s
		
		ObjectMapper objectMapper1 = new ObjectMapper();
		try {
				Customer_UI cust_add = objectMapper1.readValue(ps, Customer_UI.class);
				System.out.println("Adding customer with title :  " +cust_add.gettitle());
				Customer cust_add_db = new Customer(cust_add.gettitle(), cust_add.getdescription(), cust_add.getlocation());
				custrepo1.save(cust_add_db);
		} 
		catch (JsonProcessingException e) 
		{
			throw new RuntimeException(e);
		}*/
	}
	
	public HashSet<String> viewonlyDept ()
	{
		//List<String> listCust = new ArrayList<String>(); ;
		List<String> listLoc = new ArrayList<>(); 
		HashSet<String> hset = new HashSet<String>();

		hset.add("One");    
		hset.add("Two");    
		hset.add("Three");  

		/*
		try {
				listCust_loc.clear();
				custrepo1.findAll().forEach(listCust_loc::add);
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
				                           } 
				 );				
				//Numbers.forEach((n) -> System.out.println(n));
				 hset = new HashSet<String>(listLoc);
			}	*/
			return hset;		
	}	

	public List<Customer> viewbyTitle (String category1)
	{
		List<Customer> cust_list = new ArrayList<>(); 
		Customer s1 = new Customer();
		cust_list = custrepo1.findBytitle(category1);

		
		
		/*mt1.findBy
		try
		{
			Query query1 = new Query();
			query1.addCriteria(Criteria.where("description").is(category1));
			
			//query1.with(Sort.by(Sort.Direction.ASC, "description"));
			//cust_list = mt1.find(query1,Customer.class );
			//int size = cust_list.size();
			//System.out.println("Size from Mongo hit is " +size);
		}
		catch(NullPointerException e)
		{	
			System.out.println("Hit  from Mongo NPE " );
		} */
		cust_list.forEach ((n)  ->
				                           { 
											     n.setDescription("modified");;
												 custrepo1.save(n);
				                           } 
				 );				
				//Numbers.forEach((n) -> System.out.println(n));
				// hset1 = new HashSet<String>(listLoc) 
		return cust_list; 
	}	
}