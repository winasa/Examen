package com.example.demo.repository;

import com.example.demo.entity.CompraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ComprasRepository extends JpaRepository<CompraEntity,Long> {
}
