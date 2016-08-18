package com.mywebsite.xperiencegaming.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mywebsite.xperiencegaming.dao.CustomerOrderDao;
import com.mywebsite.xperiencegaming.model.Cart;
import com.mywebsite.xperiencegaming.model.CartItem;
import com.mywebsite.xperiencegaming.model.CustomerOrder;
import com.mywebsite.xperiencegaming.service.CartService;
import com.mywebsite.xperiencegaming.service.CustomerOrderService;


@Service
public class CustmerOrderServiceImpl implements CustomerOrderService{

    @Autowired
    private CustomerOrderDao customerOrderDao;

    @Autowired
    private CartService cartService;

    public void addCustomerOrder(CustomerOrder customerOrder){
        customerOrderDao.addCustomerOrder(customerOrder);
    }

    public double getCustomerOrderGrandTotal(int cartId){
        double grandTotal = 0;
        Cart cart = cartService.getCartById(cartId);
        List<CartItem> cartItems = cart.getCartItems();

        for (CartItem item : cartItems){
            grandTotal += item.getTotalPrice();
        }

        return grandTotal;
    }

} // The End of Class;
