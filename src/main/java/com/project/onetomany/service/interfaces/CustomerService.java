package com.project.onetomany.service.interfaces;

import com.project.onetomany.dto.OrderResponse;
import com.project.onetomany.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer saveCustomer(Customer customer);
    List<Customer> getAll();
    List<OrderResponse> getJoinInformation();
}
