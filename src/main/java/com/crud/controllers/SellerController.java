package com.crud.controllers;

import com.crud.models.Customer;
import com.crud.models.Seller;
import com.crud.services.CustomerService;
import com.crud.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
@RequestMapping("/seller")
public class SellerController {
    @Autowired
    SellerService sellerService;

    @GetMapping()
    public ArrayList<Seller> obtenerCustomers(){
        return sellerService.obtenerSellers();
    }
    @PostMapping()
    public Seller guardarUsuario(@RequestBody Seller seller){
        return sellerService.guardarSeller(seller);
    }
}
