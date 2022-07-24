package com.crud.controllers;


import com.crud.models.Customer;
import com.crud.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping()
    public ArrayList<Customer> obtenerCustomers(){
        return customerService.obtenerCustomers();
    }
    @PostMapping()
    public Customer guardarUsuario(@RequestBody Customer customer){
        return customerService.guardarCustomer(customer);
    }
}
