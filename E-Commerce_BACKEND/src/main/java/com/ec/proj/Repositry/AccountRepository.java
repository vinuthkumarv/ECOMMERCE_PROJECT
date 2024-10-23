package com.ec.proj.Repositry;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ec.proj.Entity.Accounts;
@Repository
public interface AccountRepository extends JpaRepository<Accounts, Integer>
{

	@Query(value ="select * from accounts a where (a.account_email= ?1 or a.account_phone= ?1) && a.account_password = ?2",nativeQuery = true)
	public  Accounts findbyusername(String accountMail, String accountPasswords);

	@Query(value = "select * from accounts e where e.account_email= ?1",nativeQuery = true)
	public Optional<Accounts> findByEmail(String accountemail);

    @Query(value = "select * from accounts a where (a.account_email= ?1 or a.account_phone= ?1)",nativeQuery = true)
	public Accounts findByEmailPhone(String accountemail);

	@Query(value = "select * from accounts b where b.account_phone=?1",nativeQuery = true)
	public Accounts finfByPhone(String accountPhone);

	
	@Transactional
	@Modifying
	@Query(value = "update accounts a set a.account_password=?2 where a.account_email=?1",nativeQuery = true)
	public void updatepassByMail(String accountEmail, String newPassword);
    
	@Transactional
	@Modifying
	@Query(value ="update accounts a set a.address=?2 where a.account_id=?1",nativeQuery = true)
	public void updateAddressById(Integer accountId, String address);

	
	@Query(value = "select * from accounts a where (a.account_email=?1 or a.account_phone=?1) && a.favourite=?2",nativeQuery = true)
	public Accounts findByEmailAndFav(String accountMail, String favourite);

	

	

	



	
	
}
