package com.mywebsite.xperiencegaming.service;

import com.mywebsite.xperiencegaming.model.CustomerOrder;

public interface CustomerOrderService {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);
}
