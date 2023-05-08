package edu.chnu.InternetShopProject.controller.rest;

import edu.chnu.InternetShopProject.model.Client;
import edu.chnu.InternetShopProject.model.Product;
import edu.chnu.InternetShopProject.service.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductRestController {
    @Autowired
    ProductService productService;

    @GetMapping("/")
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public Product getOne(@PathVariable String id){
        return productService.get(id);
    }

    @PostMapping("/post")
    public Product create(@RequestBody Product product){
        return productService.create(product);
    }

    @PutMapping("/put")
    public Product update(@RequestBody Product product){
        return productService.update(product);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id){
        productService.delete(id);
    }
}
