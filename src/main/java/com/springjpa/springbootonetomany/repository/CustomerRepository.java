package com.springjpa.springbootonetomany.repository;

import com.springjpa.springbootonetomany.dto.OrderResponse;
import com.springjpa.springbootonetomany.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    @Query("SELECT new com.springjpa.springbootonetomany.dto.OrderResponse(cust.firstName, prod.productName) FROM Customer cust JOIN cust.products prod")
    public List<OrderResponse> getJoinInformation();


}
