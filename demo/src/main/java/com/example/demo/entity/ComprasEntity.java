package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
@NoArgsConstructor
@AllArgsConstructor
public class ComprasEntity implements Serializable {


    @Id
    @Column(name = "comprasId")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long comprasId;

//    @OneToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "idCliente", referencedColumnName = "idCliente",nullable = false)
//    private ClientesEntity idCliente;


    @OneToMany(mappedBy = "compras" , cascade = CascadeType.PERSIST)
    private List<CompraDetalleEntity> details;


    @Column(name = "nombreCompras",nullable = true)
    private String nombreCompras;

    @CreationTimestamp
    @Column(name = "fechaRegistro", insertable = true,updatable = false)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS][.SS][.S]")

    private LocalDateTime fechaRegistro;

    @Column(name = "activo")
    private String activo;
}
