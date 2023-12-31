package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import java.util.Collections;
import java.util.Collection;
//import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
//import MongoDB.Driver.Core.Configuration.ConnectionString;
//import com.mongodb.MongoClientSettings;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.Builder;

@Configuration
public class WebConfig 
{

   /* @Bean
    public MongoClient mongo() {
        ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017/test");
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
          .applyConnectionString(connectionString)
          .build();
        
        return MongoClients.create(mongoClientSettings);
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), "test");
    }

     @Bean
  @LoadBalanced
  public RestTemplate restTemplate(RestTemplateBuilder builder) {
    return builder.build();
  }

    */

     @Bean
     @LoadBalanced
    public WebClient.Builder getWebClientBuilder() 
    {
        //WebClient webClient = WebClient.builder().build();
        return WebClient.builder();
    }


}