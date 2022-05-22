package com.example.demo;
//import org.springframework.data.annotation.Id;
import javax.persistence.Entity;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.Id;
import java.math.BigInteger;  
@Entity
@Document(collection = "customer")

public class Customer
{

  @Id
  public BigInteger Custid;

  public String title;
  public String description;
  public String location;
  //public String lasttitle;

  
  
  public Customer(BigInteger Custid ,String title ,String description , String location ) 
  {
    this.Custid = Custid;        
    this.title = title;
    this.description = description;
    this.location = location;
    //this.lasttitle = lasttitle;
  }

}