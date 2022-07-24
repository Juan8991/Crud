package com.crud.controllers;

import com.crud.models.Product;
import com.crud.models.Seller;
import com.crud.services.ProductService;
import com.crud.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping()
    public ArrayList<Product> obtenerCustomers(){
        return productService.obtenerProducts();
    }
    @PostMapping()
    public Product guardarUsuario(@RequestBody Product product){
        return productService.guardarProduct(product);
    }
}
