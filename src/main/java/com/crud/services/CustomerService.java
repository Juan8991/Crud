package com.crud.services;

import com.crud.models.Customer;
import com.crud.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public ArrayList<Customer> obtenerCustomers(){

        return (ArrayList<Customer>) customerRepository.findAll();
    }
    public Customer  guardarCustomer(Customer customer){
        return customerRepository.save(customer);

    }
    public Optional<Customer> obtenerPorId(Long id){
        return customerRepository.findById(id);
    }
    

}
