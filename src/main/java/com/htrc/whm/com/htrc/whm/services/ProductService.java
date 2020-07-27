package com.htrc.whm.com.htrc.whm.services;

import com.htrc.whm.com.htrc.whm.models.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {
    private Map<Integer, Product> products;

    public ProductService() {
        this.setProducts();
    }

    private void setProducts(){
        products = new HashMap<>();
        products.put(1, new Product(1,"Prod1","Prod Desc 1",10.10,20.10,"10-01-2020","10-01-2021",1));
        products.put(2, new Product(2,"Prod2","Prod Desc 2",11.10,22.10,"10-02-2020","10-01-2021",1));
        products.put(3, new Product(3,"Prod3","Prod Desc 3",12.10,23.10,"10-03-2020","10-01-2021",1));
        products.put(4, new Product(4,"Prod4","Prod Desc 4",13.10,24.10,"10-02-2020","10-01-2021",1));
        products.put(5, new Product(5,"Prod5","Prod Desc 5",14.10,25.10,"10-02-2020","10-01-2021",2));
    }

    public List<Product> getProducts(){
        List<Product> list = new LinkedList<>();
        for(Map.Entry<Integer,Product> prod : products.entrySet()){
            list.add(prod.getValue());
        }
        return list;
    }

    public Product getProduct(int id){
        if(products.containsKey(id)){
            return products.get(id);
        }else{
            return new Product();
        }
    }

    public Boolean setProduct(int id, Product product){
//      If existing Product
        if(products.containsKey(id)){
//            Set all modifiable properties
            Product prod = products.get(id);
            prod.setBuyAmount(product.getBuyAmount());
            prod.setBuyDate(product.getBuyDate());
            prod.setDescription(product.getDescription());
            prod.setExpireDate(product.getExpireDate());
            prod.setName(product.getName());
            prod.setSellAmount(product.getSellAmount());
            prod.setSupplierId(product.getSupplierId());
            return true;
        }else{
            return false;
        }
    }

    public Boolean addProduct(Product product){
        if(!products.containsKey(product.getId())){
            Product prod = new Product(product);
            products.put(prod.getId(), prod);
            return true;
        }else {
            return false;
        }
    }

    public Boolean removeProduct(int id){
        if(products.containsKey(id)){
            products.remove(id);
            return true;
        }else{
            return false;
        }
    }

}
