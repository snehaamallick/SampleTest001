package com.mywebsite.xperiencegaming.service;

import java.util.List;

import com.mywebsite.xperiencegaming.model.Customer;

public interface CustomerService {

    void addCustomer(Customer customer);

    Customer getCustomerById(int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername(String username);

}
