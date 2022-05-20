package com.example.demo;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CustRepo extends MongoRepository<Customer, String> 
{

  public List<Customer> findByid(String firstName);
  public List<Customer> findBytitle(String lastName);

}