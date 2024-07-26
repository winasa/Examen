package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;

@Table(name = "cliente")
@Entity
@Data
public class ClienteEntity {

    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;

    @Column(name = "nombre" ,nullable = false)
    private String nombre;

    @Column(name = "activo")
    private Boolean activo;

}
