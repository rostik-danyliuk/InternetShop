package edu.chnu.InternetShopProject.service.interfaces;

import edu.chnu.InternetShopProject.model.Bill;
import edu.chnu.InternetShopProject.model.Delivery;

import java.util.List;

public interface BillService {
    Bill create(Bill bill);
    List<Bill> getAll();
    Bill get(String id);
    Bill update(Bill bill);
    void delete(String id);
}
