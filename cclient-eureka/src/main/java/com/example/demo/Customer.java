package com.example.demo;
//import org.springframework.data.annotation.Id;
import javax.persistence.Entity;
import org.springframework.data.mongodb.core.mapping.Document;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.annotation.JsonCreator;
//import javax.persistence.Id;
import java.math.BigInteger;  
@Entity
@Document(collection = "customer")

public class Customer
{

//  @Id
  public BigInteger Custid;
  public String title;
  public String description;
  public String location;
  //public String lasttitle;


  //commant to test git commit

  
 
  public Customer(String title ,String description , String location ) 
  {
    //this.Custid = Custid;        
    this.title = title;
    this.description = description;
    this.location = location;
    //this.lasttitle = lasttitle;
  }


  public String gettitle() {
		return title;
	}

  public String getdescription() {
		return description;
	}

  public String getlocation() {
		return location;
	}


}