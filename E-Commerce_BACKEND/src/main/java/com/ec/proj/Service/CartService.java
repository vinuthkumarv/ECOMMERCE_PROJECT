package com.ec.proj.Service;

import java.util.List;

import com.ec.proj.Entity.Cart;

public interface CartService  {

	Cart saveCart(Cart cart);

	List<Cart> findByAccId(Integer accountId);

	int deleteAccByCart(Integer accountId, Integer productId);

	Cart findByAccid(Integer accountId, Integer productId);

}
