package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.aop.target.LazyInitTargetSource;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "compras")
@Data
@Setter
public class ComprasEntity implements Serializable {


    @Id
    @Column(name = "compras_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer comprasId;

//    @OneToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "idCliente", referencedColumnName = "idCliente",nullable = false)
//    private ClientesEntity idCliente;


    @OneToMany(mappedBy = "compras" , cascade = CascadeType.ALL)
    private List<CompraDetalleEntity> details;


    @Column(name = "nombreCompras",nullable = true)
    private String nombreCompras;

    @CreationTimestamp
    @Column(name = "fechaRegistro", insertable = true,updatable = false)
    private LocalDateTime fechaRegistro;

    @Column(name = "activo")
    private String activo;
}
