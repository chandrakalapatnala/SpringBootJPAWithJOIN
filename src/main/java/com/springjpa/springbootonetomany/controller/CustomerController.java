package com.springjpa.springbootonetomany.controller;

import com.springjpa.springbootonetomany.dto.OrderResponse;
import com.springjpa.springbootonetomany.entity.Customer;
import com.springjpa.springbootonetomany.repository.CustomerRepository;
import com.springjpa.springbootonetomany.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;



    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody Customer request){
        System.out.println("requestcoming from client:"+request);

        return customerRepository.save(request);
    }

    @GetMapping("/findAllOrders")
    public List<Customer> getAllOrders(){
        return customerRepository.findAll();
    }


    @GetMapping("/getCustProdNames")
    public List<OrderResponse> getJoinInformation(){
        return customerRepository.getJoinInformation();
    }


}
