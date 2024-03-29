package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.data.domain.Sort;
//import org.springframework.web.reactive.function.client.WebClient;
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
import org.springframework.web.reactive.function.client.WebClient;

import java.util.*;

@Service
public class CustomerService
{
	List<Customer> listCust = new ArrayList<>(); 
	List<Customer> listCust_loc = new ArrayList<>(); 

	@Autowired
	@LoadBalanced
	private WebClient.Builder WebClientBuilder;
	//AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

	
	@Autowired
	CustRepo custrepo1;
    public CustomerService () 
	{
				
	}
	
	public String viewAll_str()
	{
		return "listCust _aclient";		
	} 


	public String viewClientx()
	{
		/*String s1 =  WebClient.get()
						.uri("http://democlientc/democlientc/login")
						.retrieve()
						.bodyToMono(String.class)
						.block();
		
		return "listCust _aclient";
		return s1;		*/
		return WebClientBuilder.build()
						.get()
						.uri("http://democlientc/democlientc/login")
						.retrieve()
						.bodyToMono(String.class)
						.block();
	} 



	public List<Customer> viewAll()
	{
	    try {
			listCust.clear();
			custrepo1.findAll().forEach(listCust::add);;
			//groceryItemRepo.findAll().forEach(item -> System.out.println(getItemDetails(item)));
		}
		catch(NullPointerException nlx){
			System.out.println("Null pointer exception detected" +nlx.toString());
			nlx.printStackTrace();
		}
		finally 
		{
					        
		}	
		return listCust;		
	} 

	public void AddCust (String ps)
	{
		/*System.out.println("Starting to add customer  " +ps);
		
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
	public HashSet<String> viewbyTitle (String category1)
	{
		HashSet<String> hset = new HashSet<String>();
		List<String> listLoc = new ArrayList<>(); 
		List<Customer> cust_list = new ArrayList<>(); 
		HashSet<String> hset1 = new HashSet<String>();

		hset.add("One");    
		hset.add("Two");    
		hset.add("Three");  
		
		/*mt1.findBy
		try
		{
			Query query1 = new Query();
			query1.addCriteria(Criteria.where("description").is(category1));
			
			//query1.with(Sort.by(Sort.Direction.ASC, "description"));
			cust_list = mt1.find(query1,Customer.class );
			//int size = cust_list.size();
			//System.out.println("Size from Mongo hit is " +size);
		}
		catch(NullPointerException e)
		{	
			System.out.println("Hit  from Mongo NPE " );
		}
		cust_list.forEach ((n)  ->
				                           { 
												String s1 = n.title;
												listLoc.add(s1);
				                           } 
				 );				
				//Numbers.forEach((n) -> System.out.println(n));
				 hset1 = new HashSet<String>(listLoc);*/
		return hset; 
	}	
}