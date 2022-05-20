package com.example.demo;
//import org.springframework.data.annotation.Id;
//import javax.persistence.Entity;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.Id;
//@Entity
@Document(collection = "customer")
//@EqualsAndHashCode(of = {"id","title"})
public class Customer
{

  @Id
  public Integer id;
  public String title;
  public String description;
  public String location;
  //public String lasttitle;

  
  
  public Customer(Integer id, String Nom ,String desc , String loc ) 
  {
    this.id = id;    
    this.title = Nom;
    this.description = desc;
    this.location = loc;
    //this.lasttitle = lasttitle;
  }


  /*@Override
  public String toString() {
    return String.format(
        "Customer[id=%s, firsttitle='%s', lasttitle='%s']",
        id, firsttitle, lasttitle);
  }*/

}