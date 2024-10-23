package com.ec.proj.Service;

import java.util.List;

import com.ec.proj.Entity.Categories;
import com.ec.proj.Error.ExceptionFound;

public interface CategoriesService {

	Categories saveProduct(Categories categories);

	List<Categories> findAllProducts();

	List<Categories> findByProductName(String productName) throws ExceptionFound;

	Categories updateById(Categories categories, Integer productId) throws ExceptionFound;

	Categories findByPid(Integer prodid);

	List<Categories> deletById(Integer productId);

	int updateQuantity( Integer productQuantity,Integer productId);

	List<Categories> SearchCategory(String category);

}
