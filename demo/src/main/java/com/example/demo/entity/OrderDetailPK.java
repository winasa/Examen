package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class OrderDetailPK  implements Serializable {

    @Column(name = "compras_Id")
    private long comprasId;

    @Column(name = "producto_id")
    private long productId;


}
