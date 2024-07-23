package com.example.demo.impl;

import com.example.demo.entity.ComprasEntity;
import com.example.demo.repository.ComprasRepository;
import com.example.demo.service.CompraService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComprasServiceImpl implements CompraService {


    private ComprasRepository comprasRespository;

    public ComprasServiceImpl(ComprasRepository comprasRespository) {
        this.comprasRespository = comprasRespository;
    }

    @Override
    public void crearListaCompras(List<ComprasEntity> listaCompras) {
        comprasRespository.saveAll(listaCompras);
    }

    @Override
    public void deleteCompras(Long idCompras) {
        comprasRespository.deleteById(idCompras);
    }
}
