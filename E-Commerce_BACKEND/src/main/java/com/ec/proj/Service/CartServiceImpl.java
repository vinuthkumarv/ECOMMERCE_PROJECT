package com.ec.proj.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec.proj.Entity.Cart;
import com.ec.proj.Repositry.CartRepository;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository cartRepository;

	@Override
	public Cart saveCart(Cart cart) {
		return cartRepository.save(cart);
	}

	@Override
	public List<Cart> findByAccId(Integer accountId) {
		return cartRepository.findByAccId(accountId);
	}

	@Override
	public int deleteAccByCart(Integer accountId, Integer cartid) {
		return cartRepository.deleteAccByCart(accountId,cartid);
	}

	@Override
	public Cart findByAccid(Integer accountId, Integer productId) {
		return cartRepository.findByAccId(accountId,productId);
	}
}
