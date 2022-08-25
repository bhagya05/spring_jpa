package com.spring.spring_jpa.services;

import com.spring.spring_jpa.entity.Account;
import com.spring.spring_jpa.entity.Customer;
import com.spring.spring_jpa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService  {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer)
    {
        return customerRepository.save(customer);
    }
    public Customer getCustomerByCustomerID(String customerId)
    {
         return customerRepository.findById(customerId).get();
    }
    public Customer updateCustomerByID(Customer customer)
    {
        return customerRepository.save(customer);
    }

}
