package com.example.demo.impl;

import com.example.demo.dto.ClientesDTO;
import com.example.demo.entity.ClientesEntity;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.service.ServiceCliente;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ServiceClienteImpl  implements ServiceCliente {

    private ClienteRepository clienteRepository;

    public ServiceClienteImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public List<ClientesEntity> getClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Optional<ClientesEntity> getClientesById(ClientesDTO clientesDTO) {
        return clienteRepository.findById(clientesDTO.getIdCliente().intValue());
    }
}
