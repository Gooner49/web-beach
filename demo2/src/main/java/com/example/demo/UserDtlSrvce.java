package com.example.demo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import java.util.ArrayList;
//import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDtlSrvce implements UserDetailsService 
{
    @Override
    
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        System.out.println("Hello from Security controller " );
        return new User(username, "bar", new ArrayList<>());
    }
}
