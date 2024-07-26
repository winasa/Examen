package com.example.demo.impl;


import com.example.demo.entity.CompraDetalleEntity;
import com.example.demo.entity.CompraEntity;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.ComprasDetalleRepsository;
import com.example.demo.service.ComprasDellateService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComprasDetalleServiceImpl implements ComprasDellateService {


    private ComprasDetalleRepsository comprasDetalleRepository;

    private ClienteRepository clienteRepository;

    public ComprasDetalleServiceImpl(ComprasDetalleRepsository comprasDetalleRepository, ClienteRepository clienteRepository) {
        this.comprasDetalleRepository = comprasDetalleRepository;
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Optional<CompraDetalleEntity> getListaClienteByIdCliente(List<Long> listClientesDTO) {
        return comprasDetalleRepository.findById(listClientesDTO.get(0).longValue());
    }

    @Override
    public void crearListaCompras(CompraEntity compraEntity) {

    }


}
