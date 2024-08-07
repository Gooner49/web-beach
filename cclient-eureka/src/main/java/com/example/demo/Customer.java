package com.example.demo;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.math.BigInteger;  
@Entity
@Table(name = "persons")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
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

}