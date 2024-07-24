package com.example.demo.dto;


import com.example.demo.entity.CompraDetalleEntity;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class ComprasDTO{

    private Integer id;
    private String nombreCompras;
    private LocalDateTime fechaRegistro;
    private String activo;
    private List<CompraDetalleEntity> details;


}
