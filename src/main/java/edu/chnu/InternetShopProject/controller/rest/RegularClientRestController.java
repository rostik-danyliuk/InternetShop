package edu.chnu.InternetShopProject.controller.rest;

import edu.chnu.InternetShopProject.model.RegularClient;
import edu.chnu.InternetShopProject.service.impls.RegularClientServiceImpl;
import edu.chnu.InternetShopProject.service.interfaces.RegularClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/regular-clients")
public class RegularClientRestController {

    @Autowired
    RegularClientService regularClientService;

    @RequestMapping("/")
    public List<RegularClient> getAll(){
        return regularClientService.getAll();
    }
}
