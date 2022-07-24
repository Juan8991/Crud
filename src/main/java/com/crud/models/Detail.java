package com.crud.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.persistence.*;

@Entity
@Data
@Table(name = "detalle")
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "det_id", nullable = false)
    private Long detalleId;

    @Column(name = "det_iva")
    private Double detalleIva;

    @Column(name = "det_cantidad")
    private Double detalleCantidad;



    @Column(name = "det_descuento")
    private Double descuento=0.0;

    @JoinColumn(name = "prod_id_producto", nullable = false, insertable = false, updatable = false)
    @ManyToOne(targetEntity = Product.class)
    @JsonManagedReference(value = "producto-detalle")
    private Product producto;

    @JoinColumn(name = "fac_id_factura", nullable = false, insertable = false, updatable = false)
    @ManyToOne(targetEntity = Invoice.class)
    @JsonManagedReference(value = "factura-detalle")
    private Invoice factura;


}
