package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "compras")
@Data
public class ComprasEntity {


    @Id
    @Column(name = "idCompras")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCompras;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idCliente", referencedColumnName = "idCliente",nullable = false)
    private ClientesEntity idCliente;
    @Column(name = "mombreCompras",nullable = false)
    private String nombreCompras;
    @Column(name = "fechaRegistro")
    private LocalDate fechaRegistro;
    @Column(name = "fechaUltimaAcualizacion")
    private LocalDate fechaUltimaAcualizacion;
    @Column(name = "activo")
    private String activo;
}
