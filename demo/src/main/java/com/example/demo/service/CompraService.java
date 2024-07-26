package com.example.demo.service;

import com.example.demo.entity.CompraEntity;

import java.util.List;

public interface CompraService {
    void deleteCompras(long idCompras);

   List<CompraEntity> getListaCompras();

    void crearListaCompras(CompraEntity listaCompras);
}
