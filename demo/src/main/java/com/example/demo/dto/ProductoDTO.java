package com.example.demo.dto;


import lombok.Data;
@Data
public class ProductoDTO {

    private Long idProducto;
    private String clave;
    private String descripcion;
    private Boolean activo;
}
