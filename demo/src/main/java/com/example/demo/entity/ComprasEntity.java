package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.aop.target.LazyInitTargetSource;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "compras")
@Data
public class ComprasEntity {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @OneToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "idCliente", referencedColumnName = "idCliente",nullable = false)
//    private ClientesEntity idCliente;


    @OneToMany(mappedBy = "compras" , cascade = CascadeType.ALL)
    private List<CompraDetalleEntity> details;


    @Column(name = "mombreCompras",nullable = false)
    private String nombreCompras;

    @CreationTimestamp
    @Column(name = "fechaRegistro", insertable = true,updatable = false)
    private LocalDateTime fechaRegistro;

    @Column(name = "fechaUltimaAcualizacion")
    private LocalDate fechaUltimaAcualizacion;

    @Column(name = "activo")
    private String activo;
}
