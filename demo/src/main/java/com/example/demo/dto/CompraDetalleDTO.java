package com.example.demo.dto;


import lombok.Data;

@Data
public class CompraDetalleDTO {
    private Long idCompraDetalle;
    private Long idCodigoProducto;
    private ComprasDTO comprasDetalle;
    private ProductoDTO productoEntity;
    private Long cantidad;
}
