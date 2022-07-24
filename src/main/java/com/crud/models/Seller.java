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
@Table(name = "vendedor")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ven_id", nullable = false)
    private Long idVendedor;


    @Column(name = "ven_nombre")
    private String nombreVendedor;


    @Column(name = "ven_correo")
    private String correoVendedor;

    @OneToMany(mappedBy = "vendedor", fetch = FetchType.EAGER)
    @JsonIgnore
    @JsonBackReference(value = "ven-factura")
    private List<Invoice> facturasVendedor = new ArrayList<>();


}
