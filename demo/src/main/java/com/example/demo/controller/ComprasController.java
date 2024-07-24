package com.example.demo.controller;


import com.example.demo.dto.ComprasDTO;
import com.example.demo.entity.ComprasEntity;
import com.example.demo.service.CompraService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/listaCompras")
public class ComprasController {


    private CompraService compraService;

    public ComprasController(CompraService compraService) {
        this.compraService = compraService;
    }

    @PostMapping("/crearListaCompras")
    public ResponseEntity crearListaCompras(@RequestBody List<ComprasEntity> listaCompras){
        compraService.crearListaCompras(listaCompras);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getListaCompras")
    public ResponseEntity<List<ComprasEntity>> getListaCompras(){        ;
        return new ResponseEntity<List<ComprasEntity>>(compraService.getListaCompras(),HttpStatus.OK);
    }

}


