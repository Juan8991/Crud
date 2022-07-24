package com.crud.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "cliente")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cli_id", nullable = false)
    private Long id;
    @Column(name = "cli_nombre")
    private String nombre;
    @Column(name = "cli_telefono")
    private String telefono;
    @Column(name = "cli_correo")
    private String correo;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
    @JsonIgnore
    @JsonBackReference(value = "cliente-factura")
    private List<Invoice> facturas = new ArrayList<>();




}
