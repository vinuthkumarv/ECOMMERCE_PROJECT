package com.ec.proj.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Categories {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;
	@NotBlank(message="YOU CANNOT LEAVE PRODUCT CATEGORY AS NULL PLEASE ENTER PRODUCT CATEGORY")
	private String category;
	@NotBlank(message="YOU CANNOT LEAVE PRODUCT NAME AS NULL PLEASE ENTER PRODUCT NAME")
	private String productName;
	@NotBlank(message="YOU CANNOT LEAVE PRODUCT TYPE AS NULL PLEASE ENTER PRODUCT TYPE")
	private String productType;
	@NotNull(message="YOU CANNOT LEAVE PRODUCT PRICE AS NULL PLEASE ENTER PRODUCT PRICE")
	private Float productPrice;
	@NotNull(message="YOU CANNOT LEAVE PRODUCT QUANTITY AS NULL PLEASE ENTER PRODUCT QUANTITY")
	private Integer productQuantity=1;
	private String productSize;
	@NotBlank(message="YOU CANNOT LEAVE PRODUCT BRAND AS NULL PLEASE ENTER PRODUCT BRAND")
	private String productBrand;
	private String material; // dress section
	private String productWeight;
	private String productFlavour; //beauty
	private String gender;
	private String productColor;
	private String productSpecifications;
	@NotBlank(message="YOU CANNOT LEAVE PRODUCT ABOUT AS NULL PLEASE ENTER PRODUCT ABOUT")
	private String productAbout;
	private String productSelflife; //date
	private String link;
	
	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categories(String category, String productName, String productType, Float productPrice,
			Integer productQuantity, String productSize, String productBrand, String material, String productWeight,
			String productFlavour, String gender, String productColor, String productSpecifications,
			String productAbout, String productSelflife, String link) {
		super();
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
		this.link = link;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
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

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "Categories [productId=" + productId + ", category=" + category + ", productName=" + productName
				+ ", productType=" + productType + ", productPrice=" + productPrice + ", productQuantity="
				+ productQuantity + ", productSize=" + productSize + ", productBrand=" + productBrand + ", material="
				+ material + ", productWeight=" + productWeight + ", productFlavour=" + productFlavour + ", gender="
				+ gender + ", productColor=" + productColor + ", productSpecifications=" + productSpecifications
				+ ", productAbout=" + productAbout + ", productSelflife=" + productSelflife + ", link=" + link + "]";
	}

	
	
}
