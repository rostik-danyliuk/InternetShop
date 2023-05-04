package edu.chnu.InternetShopProject.service.interfaces;

import edu.chnu.InternetShopProject.model.Client;

import java.util.List;

public interface ClientService {
    void create();

    List<Client> getAll();

    Client get(String id);

    void update();
    void delete(String id);
}
