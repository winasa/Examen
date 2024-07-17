package com.example.demo.service;


import com.example.demo.dto.ClientesDTO;
import com.example.demo.dto.CompraDetalleDTO;
import com.example.demo.entity.CompraDetalleEntity;

import java.util.List;

public interface ComprasDellateService {
    List<CompraDetalleEntity> getListaClienteByIdCliente(ClientesDTO clientesDTO);
}
