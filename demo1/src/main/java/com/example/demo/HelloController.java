package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

@Controller
public class HelloController {

	@Autowired
	private CustomerService CustomerService;

	@GetMapping("/")
	public String index() 
	{	
		return "index";
	}
	@ResponseBody
	@GetMapping("/welcome")
	public String welcome()
	{
		return "welcome";
	}

	@ResponseBody
	@GetMapping("/viewlist")
	public List<Customer> view1() 
	{
		return CustomerService.viewAll();
	}

	@ResponseBody
	@GetMapping("/viewmodel")
	public List<Customer> view2() 
	{
		return CustomerService.viewAll();
	}


}