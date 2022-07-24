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
@Table(name = "producto")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "prod_id", nullable = false)
    private Long idProducto;

    @Column(name = "prod_nombre")
    private String nombreProducto;

    @Column(name = "prod_valor")
    private Integer valorProducto;

    @OneToMany(mappedBy = "producto", fetch = FetchType.EAGER)
    @JsonIgnore
    @JsonBackReference(value = "producto-detaller")
    private List<Detail> detalles = new ArrayList<>();




}
