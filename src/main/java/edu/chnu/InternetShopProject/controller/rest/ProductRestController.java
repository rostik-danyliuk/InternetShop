package edu.chnu.InternetShopProject.controller.rest;

import edu.chnu.InternetShopProject.model.Product;
import edu.chnu.InternetShopProject.service.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/vi/products")
public class ProductRestController {
    @Autowired
    ProductService productService;

    @RequestMapping("/")
    public List<Product> getAll(){
        return productService.getAll();
    }
}
