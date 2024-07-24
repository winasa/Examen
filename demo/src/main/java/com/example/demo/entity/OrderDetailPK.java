package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class OrderDetailPK {

    @Column(name = "compras_Id")
    private Integer comprasId;

    @Column(name = "producto_id")
    private Integer productId;


}
