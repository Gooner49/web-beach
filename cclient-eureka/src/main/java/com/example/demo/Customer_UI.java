package com.example.demo;
/*import org.springframework.data.annotation.Id;
import javax.persistence.Entity;
import org.springframework.data.mongodb.core.mapping.Document; 
import javax.persistence.Id;
import java.math.BigInteger;  */
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

public class Customer_UI
{

 
  public String title;
  public String description;
  public String location;
  //public String lasttitle;

  
  @JsonCreator
  //public Customer_UI(String title ,String description , String location ) 
  public Customer_UI(@JsonProperty("title")String title ,@JsonProperty("description")String description , @JsonProperty("location")String location ) 
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