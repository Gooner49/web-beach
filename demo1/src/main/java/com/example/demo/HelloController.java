package com.example.demo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

@Controller
@CrossOrigin(origins="*")
public class HelloController {

	@Autowired
	private CustomerService CustomerService;
	
	@GetMapping("/")
	public String index() 
	{	
		return "index";
	}
	//@ResponseBody
	@GetMapping("welcome")
	public String welcome()
	{
		System.out.println("Welcome");
		return "welcome";
	}

	@ResponseBody
	@GetMapping("/viewlist")
	public String view1() 
	{
		//System.out.println("View List Controller created");
		return "welcome2";
	}

	@ResponseBody
	@GetMapping("/login")
	public String view_login() 
	{
		//System.out.println("Login state ");
		return "Login state";
	}

	@ResponseBody
	@GetMapping("/viewmodel")
	public List<Customer> view2() 
	{
		//System.out.println("View Model Controller created");
		return CustomerService.viewAll();
	}
	
	
	@ResponseBody
	@PostMapping("/addCust")
	public void view2(@RequestBody String Text) 
	{
		//System.out.println("Hello  " + Text);
    	CustomerService.AddCust(Text);
	}

	/*@ResponseBody
	@GetMapping("/login")
	public String view_login() 
	{
		//System.out.println("Login state ");
		return "Login state";
	}*/
	
	@ResponseBody
	@GetMapping("/callCust")
	public String callCust() 
	{
		//System.out.println("Hello  " + Text);
    	return CustomerService.callCust();
	}


	@ResponseBody
	@GetMapping("/viewDept")
	public HashSet<String> view3() 
	{
		//System.out.println("View Model Controller created");
		return CustomerService.viewonlyDept();
	}

	/*@ResponseBody
	@GetMapping("/getTitlelist")
	public HashSet<String> view4() 
	{
		//System.out.println("getTitlelist  Controller called" );
		return CustomerService.viewbyTitle("Dummy");
	}*/

	@ResponseBody
	@GetMapping("/getTitlelist/{titleID}")
	public HashSet<String> view5(@PathVariable ("titleID") String title) 
	{
		System.out.println("getTitlelist  Controller called" +title);
		return CustomerService.viewbyTitle(title);
	}
}