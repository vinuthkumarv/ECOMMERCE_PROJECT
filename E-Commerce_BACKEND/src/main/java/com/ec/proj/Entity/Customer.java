package com.ec.proj.Entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Customer {  // history

	@Id                                                                                                                             
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cproductId;
	private Integer caccid;
	private String cmailPhonenumber;
	//@Temporal(TemporalType.TIMESTAMP)
	private Date purchaseDate=new Date(); 
	private String category;
	private String productName;
	private String productType;
	private Float productPrice;
	private Integer productQuantity;
	private String productSize;
	private String productBrand;
	private String material; // dress section
	private String productWeight;
	private String productFlavour; //beauty
	private String gender;
	private String productColor;
	private String productSpecifications;
	private String productAbout;
	private String productSelflife;//date
	private Float totalAmount;
	private String imgLink;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Integer caccid, String cmailPhonenumber, Date purchaseDate, String category, String productName,
			String productType, Float productPrice, Integer productQuantity, String productSize, String productBrand,
			String material, String productWeight, String productFlavour, String gender, String productColor,
			String productSpecifications, String productAbout, String productSelflife, Float totalAmount,
			String imgLink) {
		super();
		this.caccid = caccid;
		this.cmailPhonenumber = cmailPhonenumber;
		this.purchaseDate = purchaseDate;
		this.category = category;
		this.productName = productName;
		this.productType = productType;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.productSize = productSize;
		this.productBrand = productBrand;
		this.material = material;
		this.productWeight = productWeight;
		this.productFlavour = productFlavour;
		this.gender = gender;
		this.productColor = productColor;
		this.productSpecifications = productSpecifications;
		this.productAbout = productAbout;
		this.productSelflife = productSelflife;
		this.totalAmount = totalAmount;
		this.imgLink = imgLink;
	}
	public Integer getCproductId() {
		return cproductId;
	}
	public void setCproductId(Integer cproductId) {
		this.cproductId = cproductId;
	}
	public Integer getCaccid() {
		return caccid;
	}
	public void setCaccid(Integer caccid) {
		this.caccid = caccid;
	}
	public String getCmailPhonenumber() {
		return cmailPhonenumber;
	}
	public void setCmailPhonenumber(String cmailPhonenumber) {
		this.cmailPhonenumber = cmailPhonenumber;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public Float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}
	public Integer getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getProductSize() {
		return productSize;
	}
	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getProductWeight() {
		return productWeight;
	}
	public void setProductWeight(String productWeight) {
		this.productWeight = productWeight;
	}
	public String getProductFlavour() {
		return productFlavour;
	}
	public void setProductFlavour(String productFlavour) {
		this.productFlavour = productFlavour;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProductColor() {
		return productColor;
	}
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}
	public String getProductSpecifications() {
		return productSpecifications;
	}
	public void setProductSpecifications(String productSpecifications) {
		this.productSpecifications = productSpecifications;
	}
	public String getProductAbout() {
		return productAbout;
	}
	public void setProductAbout(String productAbout) {
		this.productAbout = productAbout;
	}
	public String getProductSelflife() {
		return productSelflife;
	}
	public void setProductSelflife(String productSelflife) {
		this.productSelflife = productSelflife;
	}
	public Float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getImgLink() {
		return imgLink;
	}
	public void setImgLink(String imgLink) {
		this.imgLink = imgLink;
	}
	@Override
	public String toString() {
		return "Customer [cproductId=" + cproductId + ", caccid=" + caccid + ", cmailPhonenumber=" + cmailPhonenumber
				+ ", purchaseDate=" + purchaseDate + ", category=" + category + ", productName=" + productName
				+ ", productType=" + productType + ", productPrice=" + productPrice + ", productQuantity="
				+ productQuantity + ", productSize=" + productSize + ", productBrand=" + productBrand + ", material="
				+ material + ", productWeight=" + productWeight + ", productFlavour=" + productFlavour + ", gender="
				+ gender + ", productColor=" + productColor + ", productSpecifications=" + productSpecifications
				+ ", productAbout=" + productAbout + ", productSelflife=" + productSelflife + ", totalAmount="
				+ totalAmount + ", imgLink=" + imgLink + "]";
	}
	
	
	
//	//connection
//	@ManyToOne(cascade =CascadeType.ALL)
//	@JoinColumn(name="mailorphone",referencedColumnName = "accountEmail" )
//	public Accounts mailorph;
//	
}
