package edu.chnu.InternetShopProject.controller.rest;

import edu.chnu.InternetShopProject.model.Client;
import edu.chnu.InternetShopProject.service.impls.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientRestController {

    @Autowired
    ClientServiceImpl clientService;

    @GetMapping("/")
    public List<Client> getAll(){
        return clientService.getAll();
    }

    @GetMapping("/{id}")
    public Client getOne(@PathVariable String id){
        return clientService.get(id);
    }

    @PostMapping("/post")
    public Client create(@RequestBody Client client){
        return clientService.create(client);
    }

    @PutMapping("/put")
    public Client update(@RequestBody Client client){
        return clientService.update(client);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id){
        clientService.delete(id);
    }
}
