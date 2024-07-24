package com.example.demo.repository;

import com.example.demo.entity.ClientesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClientesEntity,Integer> {
}
