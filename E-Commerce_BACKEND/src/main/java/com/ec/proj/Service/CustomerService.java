package com.ec.proj.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ec.proj.Entity.Customer;
import com.ec.proj.Error.ExceptionFound;

public interface CustomerService 
{



	List<Customer> findByPhonenumber(String cmailPhonenumber, Customer customer) throws ExceptionFound;

	List<Customer> findAll();

	Customer saveCustProd(Customer customer);

	List<Customer> findAccById(Integer caccid);

}
