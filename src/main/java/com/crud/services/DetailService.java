package com.crud.services;

import com.crud.models.Detail;
import com.crud.models.Product;
import com.crud.repositories.DetailRepository;
import com.crud.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DetailService {

    @Autowired
    DetailRepository detailRepository;

    public ArrayList<Detail> obtenerDetalles(){

        return (ArrayList<Detail>) detailRepository.findAll();
    }
    public Detail guardarDetalle(Detail detail){
        return detailRepository.save(detail);

    }
    public Optional<Detail> obtenerPorId(Long id){

        return detailRepository.findById(id);
    }

}
