package com.example.demo.dto;


import lombok.Data;

import java.time.LocalDate;

@Data
public class ComprasDTO {
    private Integer idCompras;
    private ClientesDTO idCliente;
    private String nombreCompras;
    private LocalDate fechaRegistro;
    private LocalDate fechaUltimaAcualizacion;
    private String activo;
}
