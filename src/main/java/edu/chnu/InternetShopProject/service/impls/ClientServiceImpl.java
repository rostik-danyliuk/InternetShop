package edu.chnu.InternetShopProject.service.impls;



import edu.chnu.InternetShopProject.model.Client;
import edu.chnu.InternetShopProject.model.enums.Regular;
import edu.chnu.InternetShopProject.repository.ClientRepository;
import edu.chnu.InternetShopProject.service.interfaces.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class ClientServiceImpl implements ClientService {
    //CRUD - Create Reading Update Delete
    @Autowired
    ClientRepository repository;

    //@PostConstruct
    public void init(){
        repository.save(new Client("Данилюк","Ростислав","Володимирович",
                "Гагаріна, 1В", "+380660334123","ros.daniliuk111@gmail.com",
                Regular.NOT_REGULAR));
    }

    @Override
    public Client create(Client client) {
        client.setCreatedAt(LocalDateTime.now());
        return repository.save(client);
    }

    @Override
    public List<Client> getAll() {
        return repository.findAll();
    }

    @Override
    public Client get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Client update(Client client) {
        String id = client.getId();
        Client client1 = this.get(id);
        client.setCreatedAt(client1.getCreatedAt());
        client.setUpdatedAt(LocalDateTime.now());
        return repository.save(client);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

}
