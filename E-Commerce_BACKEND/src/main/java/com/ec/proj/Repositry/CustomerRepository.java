package com.ec.proj.Repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ec.proj.Entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>
{

	@Query(value ="select * from customer s WHERE s.cmail_phonenumber = ?1",nativeQuery = true)
	//@Query(value = "select cmail_phonenumber from customer s where s.cmail_phonenumber =: ?1",nativeQuery = true )
	public List<Customer> findByPhonenumber(String cmailPhonenumber);

	
	@Query(value = "select * from customer s where s.caccid=?1",nativeQuery = true)
	public List<Customer> findAccById(Integer caccid);
}
