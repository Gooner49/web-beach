package com.example.demo;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CustRepo extends CrudRepository<Customer, Integer>
{
    List<Customer> findBycId(String lastName);
    Customer findByName(Integer cId);
  
}
