package com.htrc.whm.com.htrc.whm.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.Entity;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int id;
    private String name;
    private String description;
    private double buyAmount;
    private double sellAmount;
    private String buyDate;
    private String expireDate;
    private int supplierId;

    public Product(Product product) {
//        Perform Validations
        this.id = product.id;
        this.name = product.name;
        this.description = product.description;
        this.buyAmount = product.buyAmount;
        this.sellAmount = product.sellAmount;
        this.buyDate = product.buyDate;
        this.expireDate = product.expireDate;
        this.supplierId = product.supplierId;
    }
}
