package edu.chnu.InternetShopProject.service.impls;

import edu.chnu.InternetShopProject.model.RegularClient;
import edu.chnu.InternetShopProject.repository.ClientRepository;
import edu.chnu.InternetShopProject.repository.RegularClientRepository;
import edu.chnu.InternetShopProject.service.interfaces.ClientService;
import edu.chnu.InternetShopProject.service.interfaces.RegularClientService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class RegularClientServiceImpl implements RegularClientService {

    @Autowired
    RegularClientRepository repository;

    @Autowired
    ClientService clientService;

    //@PostConstruct
    public void init(){
        repository.save(new RegularClient(clientService.get("6453d8e03a5c95e01fbb8700"),
                LocalDate.now()));
    }

    @Override
    public RegularClient create(RegularClient regularClient) {
        regularClient.setCreatedAt(LocalDateTime.now());
        return repository.save(regularClient);
    }

    @Override
    public List<RegularClient> getAll() {
        return repository.findAll();
    }

    @Override
    public RegularClient get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public RegularClient update(RegularClient regularClient) {
        String id = regularClient.getId();
        RegularClient client = this.get(id);
        regularClient.setCreatedAt(client.getCreatedAt());
        regularClient.setUpdatedAt(LocalDateTime.now());
        return repository.save(regularClient);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
