package com.example.demo.impl;

import com.example.demo.dto.ComprasDTO;
import com.example.demo.entity.CompraDetalleEntity;
import com.example.demo.entity.ComprasEntity;
import com.example.demo.entity.OrderDetailPK;
import com.example.demo.repository.ComprasRepository;
import com.example.demo.service.CompraService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ComprasServiceImpl implements CompraService {


    private ComprasRepository comprasRespository;

    public ComprasServiceImpl(ComprasRepository comprasRespository) {
        this.comprasRespository = comprasRespository;
    }

    @Override
    public void crearListaCompras(List<ComprasEntity> listaCompras) {
//        for (ComprasEntity lista: listaCompras ) {
//            ComprasEntity comprasEntity = new ComprasEntity();
//            comprasEntity.setNombreCompras(lista.getNombreCompras());
//        }
        comprasRespository.saveAll(listaCompras);
    }

    @Override
    public void deleteCompras(long idCompras) {
        comprasRespository.deleteById(idCompras);
    }

    @Override
    public List<ComprasEntity> getListaCompras() {
        return comprasRespository.findAll();
    }
}
