package com.ec.proj.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ec.proj.Entity.Categories;
import com.ec.proj.Entity.Customer;
import com.ec.proj.Error.ExceptionFound;
import com.ec.proj.Service.CustomerService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CustomerController 
{
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/savecustprod")
	public Customer saveCustProd(@RequestBody Customer customer) {
		return customerService.saveCustProd(customer);
		
	}
	
	
	@GetMapping("/findbyemailorphone/{cnum}")
	public List<Customer> findByPhonenumber(@PathVariable("cnum") String cmailPhonenumber, @RequestBody Customer customer) throws ExceptionFound {
		return customerService.findByPhonenumber(cmailPhonenumber,customer);
	}
	
	// find all customer purchase list
	@GetMapping("/findallsoldprod")
	public List<Customer> findAll()
	{
		return customerService.findAll();
		}
	
	
	// findbyid
	@GetMapping("/findcustomeraccid/{acid}")
	public List<Customer> findAccById(@PathVariable("acid") Integer caccid) {
		return customerService.findAccById(caccid);
		
	}
	
	
	
} // impl
