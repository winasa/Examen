package com.example.demo.controller;

import com.example.demo.dto.ClientesDTO;
import com.example.demo.entity.ClienteEntity;
import com.example.demo.service.ServiceCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ClientesController {


    private ServiceCliente serviceClientes;

    @Autowired
    public ClientesController(ServiceCliente serviceClientes) {
        this.serviceClientes = serviceClientes;
    }


    @GetMapping("/getClientes")
    public ResponseEntity<List<ClienteEntity>> gelListClientes(){
        return new ResponseEntity< List<ClienteEntity> >(serviceClientes.getClientes(), HttpStatus.OK);
    }

    @GetMapping("/getClienteById")
    public ResponseEntity<ClienteEntity> gelListClientes(@RequestBody ClientesDTO clientesDTO){
        return new ResponseEntity<ClienteEntity>(serviceClientes.getClientesById(clientesDTO).get(), HttpStatus.OK);
    }

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
    @PostMapping("/createCliente")
    public ResponseEntity createCliente(@RequestBody ClientesDTO clientesDTO){
        serviceClientes.createCliente(clientesDTO);
        return new ResponseEntity<>( HttpStatus.CREATED);
    }


}
