package com.example.demo.service;

import com.example.demo.dto.ClientesDTO;
import com.example.demo.entity.ClienteEntity;

import java.util.List;
import java.util.Optional;

public interface ServiceCliente {
    List<ClienteEntity> getClientes();

    Optional<ClienteEntity> getClientesById(ClientesDTO clientesDTO);

    void createCliente(ClientesDTO clientesDTO);
}
