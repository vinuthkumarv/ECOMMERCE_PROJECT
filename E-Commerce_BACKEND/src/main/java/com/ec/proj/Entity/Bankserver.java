package com.ec.proj.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Bankserver {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(unique = true)
	
	private Long cCardnumber;
	@Column(unique = true)
	
	private Integer cCvvnumber;
	@Column(unique = true)
	
	private String cUpi;
	private Date expiryDate ;
	
	public Bankserver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bankserver(Long cCardnumber, Integer cCvvnumber, String cUpi, Date expiryDate) {
		super();
		this.cCardnumber = cCardnumber;
		this.cCvvnumber = cCvvnumber;
		this.cUpi = cUpi;
		this.expiryDate = expiryDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getcCardnumber() {
		return cCardnumber;
	}

	public void setcCardnumber(Long cCardnumber) {
		this.cCardnumber = cCardnumber;
	}

	public Integer getcCvvnumber() {
		return cCvvnumber;
	}

	public void setcCvvnumber(Integer cCvvnumber) {
		this.cCvvnumber = cCvvnumber;
	}

	public String getcUpi() {
		return cUpi;
	}

	public void setcUpi(String cUpi) {
		this.cUpi = cUpi;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Bankserver [id=" + id + ", cCardnumber=" + cCardnumber + ", cCvvnumber=" + cCvvnumber + ", cUpi=" + cUpi
				+ ", expiryDate=" + expiryDate + "]";
	}

	
	
	
}
