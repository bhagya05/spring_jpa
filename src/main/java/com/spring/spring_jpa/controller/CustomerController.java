package com.spring.spring_jpa.controller;

import com.spring.spring_jpa.dto.CustomerRequestDTO;
import com.spring.spring_jpa.dto.CustomerResponseDTO;
import com.spring.spring_jpa.entity.Customer;
import com.spring.spring_jpa.services.CustomerService;
import com.spring.spring_jpa.utils.Utils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping()
    @ResponseBody
    public CustomerResponseDTO createCustomer(@RequestBody CustomerRequestDTO customerRequestDTO) {

        Customer customer = customerService.createCustomer(convertToEntity(customerRequestDTO));
        CustomerResponseDTO customerResponseDTO = convertToDTO(customer);
        return customerResponseDTO;
    }


    @GetMapping("/{customerId}")
    @ResponseBody
    public CustomerResponseDTO getCustomer(@PathVariable("customerId") String customerId) {
        Customer customer = customerService.getCustomerByCustomerID(customerId);
        CustomerResponseDTO customerResponseDTO = modelMapper.map(customer, CustomerResponseDTO.class);
        return customerResponseDTO;
    }

    public Customer convertToEntity(CustomerRequestDTO customerRequestDTO) {
        Customer customer = modelMapper.map(customerRequestDTO, Customer.class);
        return customer;
    }

    public CustomerResponseDTO convertToDTO(Customer customer) {
        CustomerResponseDTO customerResponseDTO = modelMapper.map(customer, CustomerResponseDTO.class);
        return customerResponseDTO;
    }

}
