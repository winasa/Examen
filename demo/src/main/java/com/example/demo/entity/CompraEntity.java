package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "compra")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompraEntity implements Serializable {


    @Id
    @Column(name = "compraId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer compraId;

    @ManyToOne
    @JoinColumn(name = "idCliente", referencedColumnName = "idCliente",nullable = false)
    private ClienteEntity cliente;


    @OneToMany(mappedBy = "compra" , cascade = CascadeType.PERSIST)
    private List<CompraDetalleEntity> compraDetalle;


    @Column(name = "nombreCompra",nullable = true)
    private String nombreCompra;

   /* @CreationTimestamp
    @Column(name = "fechaRegistro", insertable = true,updatable = false)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS][.SS][.S]")

    private LocalDateTime fechaRegistro;*/

    @Column(name = "activo")
    private String activo;
}
