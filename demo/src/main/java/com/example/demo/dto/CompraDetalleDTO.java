package com.example.demo.dto;


import lombok.Data;

@Data
public class CompraDetalleDTO {
    private Integer idCompraDetalle;
    private Integer idCodigoProducto;
    private ComprasDTO comprasDetalle;
    private ProductoDTO productoEntity;
    private Integer cantidad;
}
