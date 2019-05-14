package com.luv2code.springdemo.service;

import com.luv2code.springdemo.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getCustomers();

    public Customer getCustomer(int id);

    public void addCustomer(Customer customer);

    public void deleteCustomer(Customer customer);

    public List<Customer> searchCustomers(String searchName);

}
