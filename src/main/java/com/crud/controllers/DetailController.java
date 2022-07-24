package com.crud.controllers;

import com.crud.models.Detail;
import com.crud.models.Product;
import com.crud.services.DetailService;
import com.crud.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
@RequestMapping("/detalle")
public class DetailController {

    @Autowired
    DetailService detailService;

    @GetMapping()
    public ArrayList<Detail> obtenerCustomers(){

        return detailService.obtenerDetalles();
    }
    @PostMapping()
    public Detail guardarUsuario(@RequestBody Detail detail){

        return detailService.guardarDetalle(detail);
    }
}
