package com.ec.proj.Repositry;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ec.proj.Entity.Categories;

@Repository
public interface CategoriesRepositry extends JpaRepository<Categories, Integer>{

    @Query(value = "select * from categories c where c.category like %?1%"
    		+ " or (c.product_name like %?1% or c.product_type like %?1%)",nativeQuery = true)
	public List<Categories> findByProductName(String productName);

    @Transactional
    @Modifying
    @Query(value="update categories c set c.product_quantity=?1 where c.product_id=?2",nativeQuery=true)
	public int updateQuantity(Integer productQuantity,Integer productId);

    @Query(value = "select * from  categories c where c.category=?1",nativeQuery = true)
	public List<Categories> SearchCategory(String category);

} 
