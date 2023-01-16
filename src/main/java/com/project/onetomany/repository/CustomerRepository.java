package com.project.onetomany.repository;

import com.project.onetomany.dto.OrderResponse;
import com.project.onetomany.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT new com.project.onetomany.dto.OrderResponse ( c.name, p.productName ) FROM Customer c JOIN c.products p")
    List<OrderResponse> getJoinInformation();
}
