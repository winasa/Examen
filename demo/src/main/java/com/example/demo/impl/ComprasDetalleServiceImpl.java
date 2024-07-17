package com.example.demo.impl;


import com.example.demo.dto.ClientesDTO;
import com.example.demo.entity.CompraDetalleEntity;
import com.example.demo.repository.ComprasDetalleRepsository;
import com.example.demo.service.ComprasDellateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ComprasDetalleServiceImpl implements ComprasDellateService {


    @Autowired
    private ComprasDetalleRepsository comprasDetalleRepository;
    @Override
    public List<CompraDetalleEntity> getListaClienteByIdCliente(ClientesDTO clientesDTO) {
        return comprasDetalleRepository.findAllById(Collections.singleton(clientesDTO.getIdCliente()));
    }
}
