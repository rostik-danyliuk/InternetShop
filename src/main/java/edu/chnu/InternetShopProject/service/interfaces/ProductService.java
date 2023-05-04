package edu.chnu.InternetShopProject.service.interfaces;

import edu.chnu.InternetShopProject.model.Client;
import edu.chnu.InternetShopProject.model.Product;

import java.util.List;

public interface ProductService {
    Product create(Product product);
    List<Product> getAll();
    Product get(String id);
    Product update(Product product);

    void delete(String id);
}
