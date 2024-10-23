package com.ec.proj.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec.proj.Entity.Accounts;
import com.ec.proj.Error.ExceptionFound;
import com.ec.proj.Repositry.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService
{
	@Autowired
	private AccountRepository accountRepository;

	//save
	@Override
	public Accounts saveAcc( Accounts accounts) 
	{
		return accountRepository.save(accounts);
	}

	//findbyid
	@Override
	public Accounts findbyaccid(Integer accountId) 
	{
		return accountRepository.findById(accountId).get();
	}

	//findbyusername
	@Override
	public Accounts findbyusername(String accountMail, String accountPasswords) 
	{
		return accountRepository.findbyusername(accountMail, accountPasswords);
		
	}

	//find all
	@Override
	public List<Accounts> findAllAccounts() {
		return accountRepository.findAll();
	}

	@Override
	public Accounts updateAccountByEmail(String accountemail, Accounts accounts) throws ExceptionFound {
		
		 Optional<Accounts> ua=accountRepository.findByEmail(accountemail);
		Accounts a=null;
		 if(!ua.isPresent()) {
			throw new ExceptionFound("Please enter valid EmailId :) ");
		}else {
			
			a=accountRepository.findByEmail(accountemail).get();
			
			if(Objects.nonNull(accounts.getFirstName()) &&
					!"".equalsIgnoreCase(accounts.getFirstName())) {
				a.setFirstName(accounts.getFirstName());
			}
			if(Objects.nonNull(accounts.getLastName()) &&
					!"".equalsIgnoreCase(accounts.getLastName())) {
				a.setLastName(accounts.getLastName());
			}
			if(Objects.nonNull(accounts.getAccountPassword()) &&
					!"".equalsIgnoreCase(accounts.getAccountPassword())) {
				a.setAccountPassword(accounts.getAccountPassword());
			}
			if(Objects.nonNull(accounts.getAccountPhone()) &&
					!"".equalsIgnoreCase(accounts.getAccountPhone())) {
				a.setAccountPhone(accounts.getAccountPhone());
			}
			if(Objects.nonNull(accounts.getAddress()) &&
					!"".equalsIgnoreCase(accounts.getAddress())) {
				a.setAddress(accounts.getAddress());
			}
			
			
		}
		
		 return accountRepository.save(a);
		
		
	}

	//deletebyid
	@Override
	public List<Accounts> deleteById(Integer accountId) {
		accountRepository.deleteById(accountId);
		return accountRepository.findAll();
	}
// find by mob email
	@Override
	public Accounts findByEmailPhone(String accountemail) {
		
		return accountRepository.findByEmailPhone(accountemail);
	}

	@Override
	public Accounts findByPhone(String accountPhone) {
		
		return accountRepository.finfByPhone(accountPhone);
	}

	@Override
	public void updatepassByMail(String accountEmail, String newPassword) {
		accountRepository.updatepassByMail(accountEmail,newPassword);
		
	}

	@Override
	public void updateAddressById(Integer accountId, String address) 
	{
		accountRepository.updateAddressById(accountId,address);
	}

	//forgotpass purpose
	@Override
	public Accounts findByEmailAndFav(String accountMail, String favourite) {
		return accountRepository.findByEmailAndFav(accountMail,favourite);
	}

}
