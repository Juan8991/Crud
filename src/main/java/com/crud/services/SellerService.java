package com.crud.services;


import com.crud.models.Seller;

import com.crud.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class SellerService {
    @Autowired
    SellerRepository sellerRepository;

    public ArrayList<Seller> obtenerSellers(){

        return (ArrayList<Seller>) sellerRepository.findAll();
    }
    public Seller  guardarSeller(Seller seller){
        return sellerRepository.save(seller);

    }
    public Optional<Seller> obtenerPorId(Long id){

        return sellerRepository.findById(id);
    }
}
