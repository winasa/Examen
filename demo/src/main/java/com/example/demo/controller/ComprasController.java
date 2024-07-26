package com.example.demo.controller;


import com.example.demo.dto.ComprasDTO;
import com.example.demo.entity.CompraEntity;
import com.example.demo.service.CompraService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/listaCompras")
public class ComprasController {


    private ModelMapper modelMapper;

    private CompraService compraService;

    public ComprasController(ModelMapper modelMapper, CompraService compraService) {
        this.modelMapper = modelMapper;
        this.compraService = compraService;
    }

    @PostMapping("/crearListaCompras")
    public ResponseEntity crearListaCompras(@RequestBody ComprasDTO compraDTO){

        CompraEntity compraEntity= modelMapper.map(compraDTO,CompraEntity.class);
        compraEntity.setCliente(compraDTO.getCliente());
        compraEntity.setCompraDetalle(compraDTO.getCompraDetalle());
        compraService.crearListaCompras(compraEntity);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getListaCompras")
    public ResponseEntity<List<CompraEntity>> getListaCompras(){        ;
        return new ResponseEntity<List<CompraEntity>>(compraService.getListaCompras(),HttpStatus.OK);
    }

}


