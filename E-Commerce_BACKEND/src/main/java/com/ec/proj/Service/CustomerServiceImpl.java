package com.ec.proj.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec.proj.Entity.Customer;
import com.ec.proj.Error.ExceptionFound;
import com.ec.proj.Repositry.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService
{

	@Autowired
	private CustomerRepository customerRepository;

	// find by number or mail
	@Override
	public List<Customer> findByPhonenumber(String cmailPhonenumber, Customer customer) throws ExceptionFound 
	{
		List<Customer> c=customerRepository.findByPhonenumber(cmailPhonenumber);
		if(c.isEmpty()) {
			throw new ExceptionFound("Please Enter Valid MobileNumber or MailId");
		}
		return customerRepository.findByPhonenumber(cmailPhonenumber);
	}

	// find all
	@Override
	public List<Customer> findAll() 
	{
		return customerRepository.findAll();
	}

	//save
	@Override
	public Customer saveCustProd(Customer customer) {
		return customerRepository.save(customer);
	}

	//find acc by id
	@Override
	public List<Customer> findAccById(Integer caccid) {
		return customerRepository.findAccById(caccid);
	}
	
	
	
	}
