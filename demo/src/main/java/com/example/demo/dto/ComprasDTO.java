package com.example.demo.dto;


import lombok.Data;

import java.time.LocalDate;

@Data
public class ComprasDTO {
    private Long id;
    private ClientesDTO idCliente;
    private String nombreCompras;
    private LocalDate fechaRegistro;
    private LocalDate fechaUltimaAcualizacion;
    private String activo;
}
