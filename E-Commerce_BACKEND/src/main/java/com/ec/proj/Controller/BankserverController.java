package com.ec.proj.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ec.proj.Entity.Bankserver;
import com.ec.proj.Service.BankserverService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BankserverController  {

	
	@Autowired
	private BankserverService bankserverService;
	
	@PostMapping("/savebank")
	public Bankserver saveDetails(@RequestBody Bankserver bankserver) {
		return bankserverService.saveDetails(bankserver);
		
	}
	
	
	//find by card
	@GetMapping("/findcardnumcvv/{cnum}/{cvv}/{date}")
	public Bankserver findByCardCvv(@PathVariable("cnum") Long cCardnumber,@PathVariable("cvv") Integer cCvvnumber,@PathVariable("date") String expiryDate) {
		return bankserverService.findByCardCvv(cCardnumber,cCvvnumber,expiryDate);
	
		
	}
	
	//find by upi
	@GetMapping("/findbyupi/{upi}")
	public Bankserver findByUpi(@PathVariable("upi") String cUpi) {
		return bankserverService.findByUpi(cUpi);
		
	}
	
}
