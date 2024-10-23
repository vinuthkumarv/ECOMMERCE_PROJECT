package com.ec.proj.Service;



import java.util.List;

import com.ec.proj.Entity.Accounts;
import com.ec.proj.Error.ExceptionFound;


public interface AccountService 
{
	Accounts saveAcc( Accounts accounts);

	Accounts findbyaccid(Integer accountId);

	Accounts findbyusername(String accountMail, String accountPassword);

	List<Accounts> findAllAccounts();

	Accounts updateAccountByEmail(String accountemail, Accounts accounts) throws ExceptionFound;

	List<Accounts> deleteById(Integer accountId);

	Accounts findByEmailPhone(String accountemail);

	Accounts findByPhone(String accountPhone);

	void updatepassByMail(String accountEmail, String newPassword);

	void updateAddressById(Integer accountId, String address);

	Accounts findByEmailAndFav(String accountMail, String favourite);
}
