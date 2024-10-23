package com.ec.proj.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec.proj.Entity.Categories;
import com.ec.proj.Error.ExceptionFound;
import com.ec.proj.Repositry.CategoriesRepositry;

@Service
public class CategoriesServiceImpl implements CategoriesService {

	@Autowired
	private CategoriesRepositry categoriesRepositry;

	// save
	@Override
	public Categories saveProduct(Categories categories) 
	{
		return categoriesRepositry.save(categories);
	}

	// findall
	@Override
	public List<Categories> findAllProducts() 
	{
		return categoriesRepositry.findAll();
	}

	// search 
	@Override
	public List<Categories> findByProductName(String productName) throws ExceptionFound 
	{
		List<Categories> ca=categoriesRepositry.findByProductName(productName);
		if(ca.isEmpty()) {
			throw new ExceptionFound("PLEASE ENTER VALID NAME OR TYPE TO SEARCH :( ");
		}else {
			return categoriesRepositry.findByProductName(productName);
		}
		}
		

	// update
	@Override
	public Categories updateById(Categories categories, Integer productId) throws ExceptionFound 
	{
		Optional<Categories> c=categoriesRepositry.findById(productId);
		Categories c2=null;
		if(!c.isPresent()) {
			throw new ExceptionFound("PRODUCT ID NOT FOUND :( ");
		}
		else {
			c2=categoriesRepositry.findById(productId).get();
			
			if(Objects.nonNull(categories.getProductName())&&
					!"".equalsIgnoreCase(categories.getProductName())) {
				c2.setProductName(categories.getProductName());
			}
			if(Objects.nonNull(categories.getProductType())&&
					!"".equalsIgnoreCase(categories.getProductType())) {
				c2.setProductType(categories.getProductType());
			}
			if(Objects.nonNull(categories.getProductPrice())&&
					(categories.getProductPrice())!=0) {
				c2.setProductPrice(categories.getProductPrice());
			}
			if(Objects.nonNull(categories.getProductQuantity())&&
					(categories.getProductQuantity())!=0) {
				c2.setProductQuantity(categories.getProductQuantity());
			}
			if(Objects.nonNull(categories.getLink())&&
					!"".equalsIgnoreCase(categories.getLink()))
			{
				c2.setLink(categories.getLink());
			}
			
			
		}
		return categoriesRepositry.save(c2);
		}

	@Override
	public Categories findByPid(Integer prodid) {
		return categoriesRepositry.findById(prodid).get();
	}

	//delete byid
	@Override
	public List<Categories> deletById(Integer productId) {
		 categoriesRepositry.deleteById(productId);
		 return categoriesRepositry.findAll();
	}

	
	@Override
	public int updateQuantity(Integer productQuantity,Integer productId) {
		
		categoriesRepositry.updateQuantity(productQuantity,productId);
		return productQuantity;
	}

	//search category
	@Override
	public List<Categories> SearchCategory(String category) {
		return categoriesRepositry.SearchCategory(category);
	}
	
	
}  //impl
