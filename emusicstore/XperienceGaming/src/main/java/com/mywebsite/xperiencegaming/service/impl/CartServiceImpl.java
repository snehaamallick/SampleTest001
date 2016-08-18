package com.mywebsite.xperiencegaming.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mywebsite.xperiencegaming.dao.CartDao;
import com.mywebsite.xperiencegaming.model.Cart;
import com.mywebsite.xperiencegaming.service.CartService;
@Service
public class CartServiceImpl implements CartService{

    @Autowired
    private CartDao cartDao;

    public Cart getCartById(int cartId){
        return cartDao.getCartById(cartId);
    }

    public void update(Cart cart){
        cartDao.update(cart);
    }

} // The End of Class;
