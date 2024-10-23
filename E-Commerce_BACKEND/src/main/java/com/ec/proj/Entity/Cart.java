package com.ec.proj.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cartId;
	private Integer productId;
	private Integer accountId;
	private String imgLink;
	private String productName;
	private String productBrand;
	private Integer productQuantity;
	private Integer selectedQty;
	private String productPrice;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(Integer productId, Integer accountId, String imgLink, String productName, String productBrand,
			Integer productQuantity, Integer selectedQty, String productPrice) {
		super();
		this.productId = productId;
		this.accountId = accountId;
		this.imgLink = imgLink;
		this.productName = productName;
		this.productBrand = productBrand;
		this.productQuantity = productQuantity;
		this.selectedQty = selectedQty;
		this.productPrice = productPrice;
	}
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public String getImgLink() {
		return imgLink;
	}
	public void setImgLink(String imgLink) {
		this.imgLink = imgLink;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public Integer getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}
	public Integer getSelectedQty() {
		return selectedQty;
	}
	public void setSelectedQty(Integer selectedQty) {
		this.selectedQty = selectedQty;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", productId=" + productId + ", accountId=" + accountId + ", imgLink="
				+ imgLink + ", productName=" + productName + ", productBrand=" + productBrand + ", productQuantity="
				+ productQuantity + ", selectedQty=" + selectedQty + ", productPrice=" + productPrice + "]";
	}
	
		
}
