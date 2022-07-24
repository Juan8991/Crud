package com.crud.controllers;


import com.crud.models.Invoice;

import com.crud.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
@RequestMapping("/factura")
public class InvoiceController {
    @Autowired
    InvoiceService invoiceService;

    @GetMapping()
    public ArrayList<Invoice> obtenerCustomers(){

        return invoiceService.obtenerFacturas();
    }
    @PostMapping()
    public Invoice guardarUsuario(@RequestBody Invoice invoice){

        return invoiceService.guardarFactura(invoice);
    }
}
