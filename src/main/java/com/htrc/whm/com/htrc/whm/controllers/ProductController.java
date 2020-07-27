package com.htrc.whm.com.htrc.whm.controllers;

import com.htrc.whm.com.htrc.whm.models.Product;
import com.htrc.whm.com.htrc.whm.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/whm")
public class ProductController {
    @Autowired
    private ProductService prodService;

    @RequestMapping(method = RequestMethod.GET, path = "/products")
    public List<Product> getProducts(){
        return prodService.getProducts();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/products/{id}")
    public Product getProduct(@PathVariable int id){
        return prodService.getProduct(id);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/products")
    public Boolean addProduct(@RequestBody Product product){
        return prodService.addProduct(product);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/products/{id}")
    public Boolean setProduct(@PathVariable int id, @RequestBody Product product){
        return prodService.setProduct(id,product);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/products/{id}")
    public Boolean removeProduct(@PathVariable int id){
        return prodService.removeProduct(id);
    }
}
