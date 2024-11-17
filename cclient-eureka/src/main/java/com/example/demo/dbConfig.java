package com.example.demo;

import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.transaction.ChainedTransactionManager;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
public class dbConfig 

{

    @Bean(name = "datasource1")
    @ConfigurationProperties("database1.datasource")
    @Primary
    public DataSource dataSource1()
    {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "datasource2")
    @ConfigurationProperties("database2.datasource")
    @Primary
    public DataSource dataSource2()
    {
        return DataSourceBuilder.create().build();
    }
    
    
}
