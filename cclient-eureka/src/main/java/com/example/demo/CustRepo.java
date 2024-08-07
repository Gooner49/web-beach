package com.example.demo;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CustRepo extends JpaRepository<Customer, String> 
{

  //public List<Customer> findByid(String firstName);
  public List<Customer> findBytitle(String lastName);

}