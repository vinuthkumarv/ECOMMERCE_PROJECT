package com.ec.proj.Repositry;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ec.proj.Entity.Bankserver;

@Repository
public interface BankserverRepositry  extends JpaRepository<Bankserver, Integer>{

	
	@Query(value = "select * from bankserver b where (b.c_cardnumber=?1) && (b.c_cvvnumber=?2) && (b.expiry_Date like ?3%)",nativeQuery = true)
	public Bankserver findByCardCvv(Long cCardnumber, Integer cCvvnumber, String expiryDate);

	@Query(value = "select * from bankserver b where b.c_upi=?1",nativeQuery = true)
	public Bankserver findByUpi(String cUpi);

}
