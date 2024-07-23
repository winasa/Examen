package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class OrderDetailPK {

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "producto_id")
    private Long productId;


}
