package com.ec.proj.Repositry;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ec.proj.Entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

	@Query(value = "select * from cart c where c.account_id=?1",nativeQuery = true)
	public List<Cart> findByAccId(Integer accountId);

	@Transactional
	@Modifying
	@Query(value ="delete from cart c where c.account_id=?1 and c.cart_id=?2",nativeQuery = true )
	public int deleteAccByCart(Integer accountId, Integer cartid);

	@Query(value = "select * from cart c where c.account_id=?1 and c.product_id=?2",nativeQuery = true)
	public Cart findByAccId(Integer accountId, Integer productId);

	

}
