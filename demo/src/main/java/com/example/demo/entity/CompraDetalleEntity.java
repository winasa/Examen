package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "compraDetalle")
public class CompraDetalleEntity {

    @EmbeddedId
    private OrderDetailPK id;

    @Column(name = "cantidad")
    private Long cantidad;

    @ManyToOne
    @MapsId("comprasId")
    @JoinColumn(name = "compras_id", insertable = true, updatable = true)
    private ComprasEntity compras;







    //    @OneToMany
//    @JoinColumn(name = "comprasDetalle", referencedColumnName = "id",nullable = false)
//    private List<ComprasEntity> comprasDetalle;

/*    @ManyToOne
    @JoinColumn(name = "productoEntity", referencedColumnName = "idProducto",nullable = false)
    private ProductoEntity productoEntity;*/
}
