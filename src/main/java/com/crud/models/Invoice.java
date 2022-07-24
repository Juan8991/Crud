package com.crud.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "factura")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fac_id", nullable = false)
    private Long facturaId;

    @Column(name = "fac_descuento_general")
    private Integer descuentoGeneral;


    @JoinColumn(name = "cli_id_cliente", nullable = false, insertable = false, updatable = false)
    @ManyToOne(targetEntity = Customer.class)
    @JsonManagedReference(value = "cliente-factura")
    private Customer cliente;

    @JoinColumn(name = "vend_id_vendedor", nullable = false, insertable = false, updatable = false)
    @ManyToOne(targetEntity = Seller.class)
    @JsonManagedReference(value = "ven-factura")
    private Seller vendedor;

    @OneToMany(mappedBy = "factura", fetch = FetchType.EAGER)
    @JsonIgnore
    @JsonBackReference(value = "factura-detalle")
    private List<Detail> detalles = new ArrayList<>();



}
