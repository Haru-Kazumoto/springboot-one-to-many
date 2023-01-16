package com.project.onetomany.service.impl;

import com.project.onetomany.dto.OrderResponse;
import com.project.onetomany.model.Customer;
import com.project.onetomany.repository.CustomerRepository;
import com.project.onetomany.service.interfaces.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        if(customer != null){
            customerRepository.save(customer);
            new ResponseEntity<>("New customer added.",HttpStatus.CREATED);
        }
        new ResponseEntity<>("Can't add new customer", HttpStatus.NO_CONTENT);
        return customer;
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public List<OrderResponse> getJoinInformation() {
        return customerRepository.getJoinInformation();
    }
}
