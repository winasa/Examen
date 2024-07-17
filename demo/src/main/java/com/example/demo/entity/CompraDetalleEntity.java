package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "compraDetalle")
@Data
public class CompraDetalleEntity {

    @Id
    @Column(name = "idCompraDetalle", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCompraDetalle;
    @Column(name = "idCodigoProducto")
    private Integer idCodigoProducto;
    @OneToMany
    @JoinColumn(name = "comprasDetalle", referencedColumnName = "idCompras",nullable = false)
    private List<ComprasEntity> comprasDetalle;
    @ManyToOne
    @JoinColumn(name = "productoEntity", referencedColumnName = "idProducto",nullable = false)
    private ProductoEntity productoEntity;
    @Column(name = "cantidad")
    private Integer cantidad;
}
