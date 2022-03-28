package com.example.demo;

//import org.springframework.data.annotation.Id;
@Data
//@EqualsAndHashCode(of = {"cId","title"})
public class Customer {

  //@Id
  public Integer cId;
  public String Name;
  //public String lastName;

  
  
  public Customer(Integer cId, String Nom) 
  {
    this.cId = cId;    
    this.Name = Nom;
    //this.lastName = lastName;
  }


  /*@Override
  public String toString() {
    return String.format(
        "Customer[id=%s, firstName='%s', lastName='%s']",
        id, firstName, lastName);
  }*/

}