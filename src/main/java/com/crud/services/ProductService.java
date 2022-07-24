package com.crud.services;

import com.crud.models.Product;
import com.crud.models.Seller;
import com.crud.repositories.ProductRepository;
import com.crud.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public ArrayList<Product> obtenerProducts(){

        return (ArrayList<Product>) productRepository.findAll();
    }
    public Product guardarProduct(Product product){
        return productRepository.save(product);

    }
    public Optional<Product> obtenerPorId(Long id){

        return productRepository.findById(id);
    }
}
