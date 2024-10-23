package com.ec.proj.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec.proj.Entity.Bankserver;
import com.ec.proj.Repositry.BankserverRepositry;

@Service
public class BankserverServiceImpl implements BankserverService {

	
	@Autowired
	private BankserverRepositry bankserverRepositry;
	
	@Override
	public Bankserver saveDetails(Bankserver bankserver) {
		
		return bankserverRepositry.save(bankserver);
	}
	@Override
	public Bankserver findByCardCvv(Long cCardnumber, Integer cCvvnumber,String expiryDate) {
		return bankserverRepositry. findByCardCvv(cCardnumber,cCvvnumber,expiryDate);
	}
	
	@Override
	public Bankserver findByUpi(String cUpi) {
		
		return bankserverRepositry.findByUpi(cUpi);
	}
	

}
