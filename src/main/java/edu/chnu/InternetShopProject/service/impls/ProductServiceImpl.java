package edu.chnu.InternetShopProject.service.impls;

import edu.chnu.InternetShopProject.model.Product;
import edu.chnu.InternetShopProject.repository.ProductRepository;
import edu.chnu.InternetShopProject.service.interfaces.ProductService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository repository;
    private List<Product> list = new ArrayList<>();

    //@PostConstruct
    void init(){
        Product product1 = new Product("feefbfefbefbefbefb", 200.00, "eevrer", 3);
        list.add(product1);
        repository.saveAll(list);
    }
    @Override
    public Product create(Product product) {
        product.setCreatedAt(LocalDateTime.now());
        return repository.save(product);
    }

    @Override
    public List<Product> getAll() {
        return repository.findAll();
    }

    @Override
    public Product get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Product update(Product product) {
        String id = product.getId();
        Product product1 = this.get(id);
        product.setCreatedAt(product1.getCreatedAt());
        product.setUpdatedAt(LocalDateTime.now());
        return repository.save(product);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
