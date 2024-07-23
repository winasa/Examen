package com.example.demo.impl;


import com.example.demo.entity.CompraDetalleEntity;
import com.example.demo.repository.ComprasDetalleRepsository;
import com.example.demo.service.ComprasDellateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComprasDetalleServiceImpl implements ComprasDellateService {


    @Autowired
    private ComprasDetalleRepsository comprasDetalleRepository;
    @Override
    public Optional<CompraDetalleEntity> getListaClienteByIdCliente(List<Long> listClientesDTO) {
        return comprasDetalleRepository.findById(listClientesDTO.get(0).longValue());
    }
}
