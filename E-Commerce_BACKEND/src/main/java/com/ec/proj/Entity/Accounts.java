package com.ec.proj.Entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Accounts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer accountId;
	@NotBlank(message = "Please Enter Your FirstName")
	private String firstName;
	private String lastName;
	@Column(length=50,nullable=false,unique = true)
	@Email(message="Please enter valid email",regexp = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\.[a-zA-Z.]{2,5}")
	private String accountEmail;
	@Column(unique = true)
	private String accountPhone;
	private String address;
	private String favourite;
	@Size(min=4, message="Password Should Contain Atleast 4 character")
	@Size(max=15,message="")
	private String accountPassword;
	@Temporal(TemporalType.DATE)
	private Date accountCreatedDate=new Date();
	public Accounts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Accounts(String firstName, String lastName, String accountEmail, String accountPhone, String address,
			String favourite, String accountPassword, Date accountCreatedDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountEmail = accountEmail;
		this.accountPhone = accountPhone;
		this.address = address;
		this.favourite = favourite;
		this.accountPassword = accountPassword;
		this.accountCreatedDate = accountCreatedDate;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAccountEmail() {
		return accountEmail;
	}
	public void setAccountEmail(String accountEmail) {
		this.accountEmail = accountEmail;
	}
	public String getAccountPhone() {
		return accountPhone;
	}
	public void setAccountPhone(String accountPhone) {
		this.accountPhone = accountPhone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFavourite() {
		return favourite;
	}
	public void setFavourite(String favourite) {
		this.favourite = favourite;
	}
	public String getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	public Date getAccountCreatedDate() {
		return accountCreatedDate;
	}
	public void setAccountCreatedDate(Date accountCreatedDate) {
		this.accountCreatedDate = accountCreatedDate;
	}
	@Override
	public String toString() {
		return "Accounts [accountId=" + accountId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", accountEmail=" + accountEmail + ", accountPhone=" + accountPhone + ", address=" + address
				+ ", favourite=" + favourite + ", accountPassword=" + accountPassword + ", accountCreatedDate="
				+ accountCreatedDate + "]";
	}

	
	
//	//connection
//	@OneToMany(mappedBy = "mailorph")
//	Set<Customer> cob=new HashSet<>();
	
	
	
	
	
	
	
	
	
}
