package com.crud.services;

import com.crud.models.Detail;
import com.crud.models.Invoice;
import com.crud.repositories.DetailRepository;
import com.crud.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class InvoiceService {
    @Autowired
    InvoiceRepository invoiceRepository;

    public ArrayList<Invoice> obtenerFacturas(){

        return (ArrayList<Invoice>) invoiceRepository.findAll();
    }
    public Invoice guardarFactura(Invoice detail){
        return invoiceRepository.save(detail);

    }
    public Optional<Invoice> obtenerPorId(Long id){

        return invoiceRepository.findById(id);
    }

}
