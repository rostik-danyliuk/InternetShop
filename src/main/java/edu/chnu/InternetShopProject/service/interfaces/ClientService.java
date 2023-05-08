package edu.chnu.InternetShopProject.service.interfaces;

import edu.chnu.InternetShopProject.model.Client;

import java.util.List;

public interface ClientService {
    Client create(Client client);

    List<Client> getAll();

    Client get(String id);

    Client update(Client client);
    void delete(String id);
}
