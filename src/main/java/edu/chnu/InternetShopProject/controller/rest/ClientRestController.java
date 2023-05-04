package edu.chnu.InternetShopProject.controller.rest;

import edu.chnu.InternetShopProject.model.Client;
import edu.chnu.InternetShopProject.service.impls.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientRestController {

    @Autowired
    ClientServiceImpl clientService;

    @RequestMapping("/")
    public List<Client> getAll(){
        return clientService.getAll();
    }
}
