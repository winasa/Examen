package com.example.demo.impl;

import com.example.demo.dto.ClientesDTO;
import com.example.demo.entity.ClienteEntity;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.service.ServiceCliente;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ServiceClienteImpl  implements ServiceCliente {


    @Autowired
    private ModelMapper modelMapper;
    private ClienteRepository clienteRepository;

    public ServiceClienteImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public List<ClienteEntity> getClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Optional<ClienteEntity> getClientesById(ClientesDTO clientesDTO) {
        return clienteRepository.findById(clientesDTO.getIdCliente().intValue());
    }

    @Override
    public void createCliente(ClientesDTO clientesDTO) {
      ClienteEntity clientesEntity=  modelMapper.map(clientesDTO, ClienteEntity.class);

        clienteRepository.save(clientesEntity);
    }
}
