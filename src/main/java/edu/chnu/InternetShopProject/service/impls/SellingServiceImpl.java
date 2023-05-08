package edu.chnu.InternetShopProject.service.impls;

import edu.chnu.InternetShopProject.model.Selling;
import edu.chnu.InternetShopProject.repository.SellingRepository;
import edu.chnu.InternetShopProject.service.interfaces.ClientService;
import edu.chnu.InternetShopProject.service.interfaces.ProductService;
import edu.chnu.InternetShopProject.service.interfaces.SellingService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
@Service
public class SellingServiceImpl implements SellingService {
    @Autowired
    SellingRepository repository;

    @Autowired
    ClientService clientService;

    @Autowired
    ProductService productService;

    //@PostConstruct
    public void init(){
        repository.save(new Selling(clientService.get("6453d8e03a5c95e01fbb8700"),
                productService.get("6453d7183a5c95e01fbb86fa"),
                LocalDate.now(),
                0));
    }

    @Override
    public Selling create(Selling selling) {
        selling.setCreatedAt(LocalDateTime.now());
        return repository.save(selling);
    }

    @Override
    public List<Selling> getAll() {
        return repository.findAll();
    }

    @Override
    public Selling get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Selling update(Selling selling) {
        String id = selling.getId();
        Selling selling1 = this.get(id);
        selling.setCreatedAt(selling1.getCreatedAt());
        selling.setUpdatedAt(LocalDateTime.now());
        return repository.save(selling);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
