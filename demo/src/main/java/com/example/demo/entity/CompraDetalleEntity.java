package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "compraDetalle")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CompraDetalleEntity implements Serializable {

    @EmbeddedId
    private BuyDetailPK id;

    @Column(name = "cantidad")
    private long cantidad;

    @ManyToOne
    @MapsId("compraId")
    @ToString.Exclude
    @JoinColumn(name = "compra_id", insertable = false, updatable = false)
    private CompraEntity compra;


/*    @ManyToOne
    @JoinColumn(name = "productoEntity", referencedColumnName = "idProducto",nullable = false)
    private ProductoEntity productoEntity;*/
}
