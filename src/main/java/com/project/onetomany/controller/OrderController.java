package com.project.onetomany.controller;

import com.project.onetomany.dto.OrderRequest;
import com.project.onetomany.dto.OrderResponse;
import com.project.onetomany.model.Customer;
import com.project.onetomany.service.interfaces.CustomerService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    private final CustomerService customerService;

    @Autowired
    public OrderController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody @NotNull OrderRequest request){
        return customerService.saveCustomer(request.getCustomer());
    }

    @GetMapping("/findAllOrders")
    public List<Customer> getALl(){
        return customerService.getAll();
    }

    @GetMapping("/getAllInformation")
    public List<OrderResponse> getJoinInformation(){
        return customerService.getJoinInformation();
    }
}
