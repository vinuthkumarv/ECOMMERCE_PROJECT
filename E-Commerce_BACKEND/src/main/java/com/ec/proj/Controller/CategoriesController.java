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

import com.ec.proj.Entity.Categories;
import com.ec.proj.Error.ExceptionFound;
import com.ec.proj.Service.CategoriesService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CategoriesController {

	@Autowired
	private CategoriesService categoriesService;
	
	// save
	@PostMapping("/saveproducts")
	public ResponseEntity<Categories> saveProduct( @Valid @RequestBody Categories categories) 
	{
		Categories c=categoriesService.saveProduct(categories);
		return new ResponseEntity<Categories>(c,HttpStatus.CREATED);
	}
	
	@GetMapping("/getbypid/{id}")
	public Categories findByPid(@PathVariable("id") Integer prodid)
	{
		return categoriesService.findByPid(prodid);
		
	}
	
	 // find all
	@GetMapping("/findallproducts")
	public List<Categories> findAllProducts()
	{
		return categoriesService.findAllProducts();
		}
	
	// SEARCH
	@GetMapping("/findbyproductname/{pname}")
	public List<Categories> findByProductName(@PathVariable("pname") String productName) throws ExceptionFound{
		return categoriesService.findByProductName(productName);
		
	}
	
	// update by id 
	@PutMapping("/updatebyid/{pid}")
	public Categories updateById(@PathVariable("pid") Integer productId,@RequestBody Categories categories) throws ExceptionFound {
		return categoriesService.updateById(categories,productId);
		}
	
	//
	
	//delete byid
	@DeleteMapping("/deletebypid/{pid}")
	public List<Categories> deleteById(@PathVariable("pid") Integer productId) {
		return categoriesService.deletById(productId);
	}
	
	@PutMapping("/updatequn/{pqun}/{pid}")
	public int updateQuantity(@PathVariable("pqun") Integer productQuantity,@PathVariable("pid") Integer productId) {
		System.out.println(productQuantity+" "+productId);
		return categoriesService.updateQuantity(productQuantity,productId);
	}
	
	
	//category serach 
	@GetMapping("/searchcategory/{category}")
	public List<Categories> SearchCategory(@PathVariable("category") String category){
		return categoriesService.SearchCategory(category);
		
	}
	
	
} //controller
