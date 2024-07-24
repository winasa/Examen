package com.example.demo.repository;

import com.example.demo.entity.CompraDetalleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprasDetalleRepsository extends JpaRepository<CompraDetalleEntity,Integer> {
}

