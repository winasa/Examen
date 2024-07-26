package com.example.demo.service;


import com.example.demo.entity.CompraDetalleEntity;
import com.example.demo.entity.CompraEntity;

import java.util.List;
import java.util.Optional;

public interface ComprasDellateService {
    Optional<CompraDetalleEntity> getListaClienteByIdCliente(List<Long> clientesDTO);

    void crearListaCompras(CompraEntity compraEntity);

}
