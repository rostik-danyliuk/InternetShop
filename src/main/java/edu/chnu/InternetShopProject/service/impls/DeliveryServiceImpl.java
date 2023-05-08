package edu.chnu.InternetShopProject.service.impls;

import edu.chnu.InternetShopProject.model.Delivery;
import edu.chnu.InternetShopProject.repository.DeliveryRepository;
import edu.chnu.InternetShopProject.service.interfaces.DeliveryService;
import edu.chnu.InternetShopProject.service.interfaces.SellingService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeliveryServiceImpl implements DeliveryService {
    @Autowired
    DeliveryRepository repository;

    @Autowired
    SellingService sellingService;

    //@PostConstruct
    public void init(){
        repository.save(new Delivery(sellingService.get("645565bf59ec0e7c7b5356e9"),
                LocalDate.now(),
                LocalDate.now()));
    }

    @Override
    public Delivery create(Delivery delivery) {
        delivery.setCreatedAt(LocalDateTime.now());
        return repository.save(delivery);
    }

    @Override
    public List<Delivery> getAll() {
        return repository.findAll();
    }

    @Override
    public Delivery get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Delivery update(Delivery delivery) {
        String id = delivery.getId();
        Delivery delivery1 = this.get(id);
        delivery.setCreatedAt(delivery1.getCreatedAt());
        delivery.setUpdatedAt(LocalDateTime.now());
        return repository.save(delivery);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
