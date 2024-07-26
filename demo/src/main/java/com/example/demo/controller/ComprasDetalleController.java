package com.example.demo.controller;

import com.example.demo.entity.CompraDetalleEntity;
import com.example.demo.entity.CompraEntity;
import com.example.demo.service.ComprasDellateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ComprasDetalleController {

    private ComprasDellateService  comprasDellateService;


    public ComprasDetalleController(ComprasDellateService comprasDellateService) {
        this.comprasDellateService = comprasDellateService;
    }


    @GetMapping("/getListaClienteByIdCliente")
    public ResponseEntity<List<CompraDetalleEntity>> getListaClienteByIdCliente(@RequestBody List<Long> clientesDTO){
        return new ResponseEntity< List<CompraDetalleEntity> >((List<CompraDetalleEntity>) comprasDellateService.getListaClienteByIdCliente(clientesDTO).get(), HttpStatus.OK);
    }


//    @GetMapping("/getClienteById")
//    public ResponseEntity<ClientesEntity> gelListClientes(@RequestBody ClientesDTO clientesDTO){
//        return new ResponseEntity<ClientesEntity>(serviceClientes.getClientesById(clientesDTO).get(), HttpStatus.OK);
//    }

//    @GetMapping("/updateClienteById")
//    public ResponseEntity<List<ClientesEntity>> updateCliente(@RequestBody ClientesDTO clientesDTO){
//        return new ResponseEntity< List< ClientesEntity > >(serviceClientes.updateClienteById(clientesDTO), HttpStatus.OK);
//    }
//
//    @DeleteMapping("/deleteClienteById")
//    public ResponseEntity<List<ClientesEntity>> deleteClienteById(@RequestBody ClientesDTO clientesDTO){
//        return new ResponseEntity< List< ClientesEntity > >(serviceClientes.deleteClienteById(clientesDTO), HttpStatus.OK);
//    }
//
//    @PostMapping("/createCliente")
//    public ResponseEntity<List<ClientesEntity>> createCliente(@RequestBody ClientesDTO clientesDTO){
//        return new ResponseEntity< List< ClientesEntity > >(serviceClientes.createCliente(clientesDTO), HttpStatus.OK);
//    }


}
