package com.ec.proj.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ec.proj.Entity.Accounts;
import com.ec.proj.Entity.Categories;
import com.ec.proj.Error.ExceptionFound;
import com.ec.proj.Service.AccountService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AccountController 
{
	@Autowired
    private AccountService accountService;
	
	@PostMapping("/saveaccs")
	public ResponseEntity<Accounts> saveAcc( @Valid @RequestBody Accounts accounts) 
	{
		//return accountService.saveAcc(accounts);
	Accounts ac=accountService.saveAcc(accounts);
    return new ResponseEntity<Accounts>(ac,HttpStatus.CREATED);
	}
	
	//getbyid
	@GetMapping("/findbyacid/{aid}")
	public Accounts findbyaccid(@PathVariable("aid") Integer accountId)
	{
		return accountService.findbyaccid(accountId);
	}
	//getbyusername
	@GetMapping("/findlogin/{mail}/{pass}")
	public Accounts findbyusername(@PathVariable("mail")String accountMail,@PathVariable("pass")String accountPasswords )
	{
		return accountService.findbyusername(accountMail,accountPasswords);
	}
	
	//find all
	@GetMapping("/findallaccounts")
	public List<Accounts> findAllAccounts(){
		return accountService.findAllAccounts();
	}
	
	//update
	@PutMapping("/updatebymailid/{mailid}")
	public Accounts updateAccountByEmail(@PathVariable("mailid")String accountemail,@RequestBody Accounts accounts ) throws ExceptionFound {
		return accountService.updateAccountByEmail(accountemail,accounts);
		
	}
	
	//deletebyid
	@DeleteMapping("/deletebyaid/{aid}")
	public List<Accounts> deleteById(@PathVariable("aid") Integer accountId) {
		return accountService.deleteById(accountId);
	}
	
	@GetMapping("/findbymobemail/{mail}")
	public Accounts findByEmailPhone(@PathVariable("mail") String accountemail) {
		return accountService.findByEmailPhone(accountemail);
		
	}
	
	//forgotpass
	@GetMapping("/findbymailandfav/{mail}/{fav}")
	public Accounts findByEmailAndFav(@PathVariable("mail") String accountMail,@PathVariable("fav") String favourite) {
		return accountService.findByEmailAndFav(accountMail,favourite);
		
	}
	

	@GetMapping("/findbymobnum/{mob}")
	public  Accounts findByPhone(@PathVariable("mob") String accountPhone) {
		return accountService.findByPhone(accountPhone);
	}
	
	
	@PutMapping("/updatenewpass/{mail}/{npass}")
	public void updatePassByMail(@PathVariable("mail") String accountEmail,@PathVariable("npass") String newPassword) {
		accountService.updatepassByMail(accountEmail,newPassword);
	}
	
	@PutMapping("/updateaddress/{aid}/{add}")
	public void updateAddressById(@PathVariable("aid") Integer accountId,@PathVariable("add") String address)
	{
		accountService.updateAddressById(accountId,address);
	}
	
}
