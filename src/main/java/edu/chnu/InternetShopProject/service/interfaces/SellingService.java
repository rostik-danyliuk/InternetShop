package edu.chnu.InternetShopProject.service.interfaces;

import edu.chnu.InternetShopProject.model.RegularClient;
import edu.chnu.InternetShopProject.model.Selling;

import java.util.List;

public interface SellingService {
    Selling create(Selling selling);
    List<Selling> getAll();
    Selling get(String id);
    Selling update(Selling selling);
    void delete(String id);
}
