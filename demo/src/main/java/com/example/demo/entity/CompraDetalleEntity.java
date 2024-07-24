package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "compraDetalle")
@NoArgsConstructor
@AllArgsConstructor
public class CompraDetalleEntity implements Serializable {

    @EmbeddedId
    private OrderDetailPK id;

    @Column(name = "cantidad")
    private long cantidad;

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
