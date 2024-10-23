package com.ec.proj.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ec.proj.Entity.Cart;
import com.ec.proj.Service.CartService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CartController {
    @Autowired
	private CartService cartService;
	
    //save
    @PostMapping("/savecart")
    public Cart saveCart(@RequestBody Cart cart) {
		return cartService.saveCart(cart);
   }
    
    //find by id 
    @GetMapping("/findcartbyaccid/{aid}")
    public List<Cart> findByAccId(@PathVariable("aid") Integer accountId){
		return  cartService.findByAccId(accountId);
    	
    }
    
    //delete by id
    @DeleteMapping("/deletecartbyid/{aid}/{cid}")
    public int deleteAccByCart(@PathVariable("aid") Integer accountId,@PathVariable("cid") Integer cartid) {
		return cartService.deleteAccByCart(accountId,cartid);
   }
    
    @GetMapping("/findbyaccid/{accid}/{pid}")
    public Cart findByAccid(@PathVariable("accid") Integer accountId,@PathVariable("pid")Integer productId) {
		return cartService.findByAccid(accountId,productId);
    	
    }
    
}
