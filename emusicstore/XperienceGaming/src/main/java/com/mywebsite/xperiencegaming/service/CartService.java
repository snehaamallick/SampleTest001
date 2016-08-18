package com.mywebsite.xperiencegaming.service;

import com.mywebsite.xperiencegaming.model.Cart;

public interface CartService {

    Cart getCartById(int cartId);

    void update(Cart cart);
}

