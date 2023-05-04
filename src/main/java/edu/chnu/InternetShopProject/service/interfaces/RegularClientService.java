package edu.chnu.InternetShopProject.service.interfaces;

import edu.chnu.InternetShopProject.model.Product;
import edu.chnu.InternetShopProject.model.RegularClient;

import java.util.List;

public interface RegularClientService {
    RegularClient create(RegularClient regularClient);
    List<RegularClient> getAll();
    RegularClient get(String id);
    RegularClient update(RegularClient regularClient);
    void delete(String id);
}
