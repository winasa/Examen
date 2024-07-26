package com.example.demo.dto;


import com.example.demo.entity.ClienteEntity;
import com.example.demo.entity.CompraDetalleEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ComprasDTO implements Serializable{
    private Integer compraId;
    private ClienteEntity cliente;
    private List<CompraDetalleEntity> compraDetalle;
    private String nombreCompra;
    private String activo;
}
