package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "compraDetalle")
@Data
public class CompraDetalleEntity {

    @EmbeddedId
    private OrderDetailPK id;

//    @OneToMany
//    @JoinColumn(name = "comprasDetalle", referencedColumnName = "id",nullable = false)
//    private List<ComprasEntity> comprasDetalle;

/*    @ManyToOne
    @JoinColumn(name = "productoEntity", referencedColumnName = "idProducto",nullable = false)
    private ProductoEntity productoEntity;*/

    @Column(name = "cantidad")
    private Long cantidad;

    @ManyToOne
    @JoinColumn(name = "order_id", insertable = false, updatable = false)
    @MapsId("orderId")
    private ComprasEntity compras;
}
