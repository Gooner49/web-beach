package com.example.demo;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import org.springframework.data.mongodb.core.mapping.Document;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.annotation.JsonCreator;
//import javax.persistence.Id;
import java.math.BigInteger;  
@Entity
@Table(name = "persons")

public class Customer
{

  @Id
  //@Column(name = "LastName")
  public BigInteger Custid;

  @Column(name = "City")
  public String title;

  @Column(name = "Firstname")
  public String description;

  @Column(name = "Address")
  public String location;

  public Customer() 
  {  
    
  }

  
 
  public Customer(String title  , String location ) 
  {
    //this.Custid = Custid;        
    this.title = title;
    //this.description = description;
    this.location = location;
    //this.lasttitle = lasttitle;
  }


  public String gettitle() {
		return title;
	}

  //public String getdescription() {
	//	return description;
	// }

  public String getlocation() {
		return location;
	}


}