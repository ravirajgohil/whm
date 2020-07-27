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

//    public Product(int id, String name, String description, double buyAmount, double sellAmount, String buyDate, String expireDate, int supplierId) {
//        this.id = id;
//        this.name = name;
//        this.description = description;
//        this.buyAmount = buyAmount;
//        this.sellAmount = sellAmount;
//        this.buyDate = buyDate;
//        this.expireDate = expireDate;
//        this.supplierId = supplierId;
//    }

//    public Product() {
//    }

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

//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public double getBuyAmount() {
//        return buyAmount;
//    }
//
//    public void setBuyAmount(double buyAmount) {
////        Validation ([0-9]*.[0-9]*|[0-9]*)
//        this.buyAmount = buyAmount;
//    }

    public double getSellAmount() {
        return sellAmount;
    }

    public void setSellAmount(double sellAmount) {
//        Validation ([0-9]*.[0-9]*|[0-9]*)
        this.sellAmount = sellAmount;
    }

    public String getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(String buyDate) {
//        [0-9][0-9]:[0-9][0-9]:[0-9][0-9][0-9][0-9]
        this.buyDate = buyDate;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
//        [0-9][0-9]:[0-9][0-9]:[0-9][0-9][0-9][0-9]
        this.expireDate = expireDate;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
//        Validate Supplier Id against available Suppliers
        this.supplierId = supplierId;
    }
}
