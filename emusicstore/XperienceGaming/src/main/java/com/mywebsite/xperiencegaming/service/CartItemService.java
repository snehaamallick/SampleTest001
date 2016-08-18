package com.mywebsite.xperiencegaming.service;

import com.mywebsite.xperiencegaming.model.Cart;
import com.mywebsite.xperiencegaming.model.CartItem;

public interface CartItemService {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId(int productId);

}
