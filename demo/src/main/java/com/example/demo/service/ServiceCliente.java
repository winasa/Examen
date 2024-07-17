package com.example.demo.service;

import com.example.demo.dto.ClientesDTO;
import com.example.demo.entity.ClientesEntity;

import java.util.List;
import java.util.Optional;

public interface ServiceCliente {
    List<ClientesEntity> getClientes();

    Optional<ClientesEntity> getClientesById(ClientesDTO clientesDTO);
}
