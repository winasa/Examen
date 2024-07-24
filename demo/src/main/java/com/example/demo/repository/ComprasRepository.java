package com.example.demo.repository;

import com.example.demo.entity.ComprasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ComprasRepository extends JpaRepository<ComprasEntity,Long> {
}
