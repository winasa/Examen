package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "producto")
@Data
public class ProductoEntity {
    @Id
    @Column( name = "idProducto",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;

    @Column(name = "clave")
    private String clave;

    @Column( name = "descripcion")
    private String descripcion;

    @Column(name = "activo")
    private Boolean activo;
}
