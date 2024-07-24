package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class OrderDetailPK {

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "producto_id")
    private Integer productId;


}
