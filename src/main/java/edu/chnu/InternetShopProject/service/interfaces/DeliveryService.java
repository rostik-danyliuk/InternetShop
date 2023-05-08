package edu.chnu.InternetShopProject.service.interfaces;

import edu.chnu.InternetShopProject.model.Delivery;
import edu.chnu.InternetShopProject.model.Selling;

import java.util.List;

public interface DeliveryService {
    Delivery create(Delivery delivery);
    List<Delivery> getAll();
    Delivery get(String id);
    Delivery update(Delivery delivery);
    void delete(String id);
}
