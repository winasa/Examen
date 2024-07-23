package com.example.demo.controller;


import com.example.demo.entity.ComprasEntity;
import com.example.demo.service.CompraService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productosController")
public class ProductoController {


    private CompraService compraService;

    @PostMapping("/deleteCompras")
    public ResponseEntity deleteCompras(@RequestBody ComprasEntity comprasEntity){
        compraService.deleteCompras(comprasEntity.getId());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
