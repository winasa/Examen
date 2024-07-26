package com.example.demo.impl;

import com.example.demo.entity.ClienteEntity;
import com.example.demo.entity.CompraDetalleEntity;
import com.example.demo.entity.CompraEntity;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.ComprasRepository;
import com.example.demo.service.CompraService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ComprasServiceImpl implements CompraService {


    private ComprasRepository comprasRespository;
    private ClienteRepository clienteRepository;



    public ComprasServiceImpl(ComprasRepository comprasRespository, ClienteRepository clienteRepository) {
        this.comprasRespository = comprasRespository;
        this.clienteRepository = clienteRepository;
    }

    @Override
    public void deleteCompras(long idCompras) {
        comprasRespository.deleteById(idCompras);
    }

    @Override
    public List<CompraEntity> getListaCompras() {
        return comprasRespository.findAll();
    }
    @Override
    public void crearListaCompras(CompraEntity compraEntity) {
        Optional<ClienteEntity> clienteEntity = clienteRepository.findById(compraEntity.getCliente().getIdCliente());
        List<CompraDetalleEntity> listCompraDetalle = new ArrayList<>();
        for (CompraDetalleEntity lista:compraEntity.getCompraDetalle()) {
            compraEntity.setCliente(clienteEntity.get());
            lista.setCompra(compraEntity);
            listCompraDetalle.add(lista);
        }
        compraEntity.setCompraDetalle(listCompraDetalle);
        compraEntity.setCliente(clienteEntity.get());

        comprasRespository.save(compraEntity);
    }
}
