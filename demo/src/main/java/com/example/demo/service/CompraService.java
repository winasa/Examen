package com.example.demo.service;

import com.example.demo.dto.ComprasDTO;
import com.example.demo.entity.ClientesEntity;
import com.example.demo.entity.ComprasEntity;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CompraService {
    void crearListaCompras(List<ComprasEntity> listaCompras);

    void deleteCompras(Integer idCompras);

   List<ComprasEntity> getListaCompras();
}
