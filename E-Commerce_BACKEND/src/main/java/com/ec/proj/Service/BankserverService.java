package com.ec.proj.Service;

import com.ec.proj.Entity.Bankserver;

public interface BankserverService {

	  Bankserver saveDetails(Bankserver bankserver);

	 Bankserver findByCardCvv(Long cCardnumber, Integer cCvvnumber, String expiryDate);

	Bankserver findByUpi(String cUpi);

}
