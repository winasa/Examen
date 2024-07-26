package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BuyDetailPK implements Serializable {

    @Column(name = "compra_Id")
    private long compraId;

    @Column(name = "producto_id")
    private long productId;


}
