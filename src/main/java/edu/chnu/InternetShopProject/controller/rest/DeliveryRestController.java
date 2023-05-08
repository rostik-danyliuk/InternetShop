package edu.chnu.InternetShopProject.controller.rest;

import edu.chnu.InternetShopProject.model.Delivery;
import edu.chnu.InternetShopProject.model.Product;
import edu.chnu.InternetShopProject.service.interfaces.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/deliverys")
public class DeliveryRestController {
    @Autowired
    DeliveryService deliveryService;
    @GetMapping("/")
    public List<Delivery> getAll(){
        return deliveryService.getAll();
    }

    @GetMapping("/{id}")
    public Delivery getOne(@PathVariable String id){
        return deliveryService.get(id);
    }

    @PostMapping("/post")
    public Delivery create(@RequestBody Delivery delivery){
        return deliveryService.create(delivery);
    }

    @PutMapping("/put")
    public Delivery update(@RequestBody Delivery delivery){
        return deliveryService.update(delivery);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id){
        deliveryService.delete(id);
    }
}
