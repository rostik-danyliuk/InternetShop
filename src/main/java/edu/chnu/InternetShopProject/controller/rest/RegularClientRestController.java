package edu.chnu.InternetShopProject.controller.rest;

import edu.chnu.InternetShopProject.model.RegularClient;
import edu.chnu.InternetShopProject.service.impls.RegularClientServiceImpl;
import edu.chnu.InternetShopProject.service.interfaces.RegularClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/regular-clients")
public class RegularClientRestController {

    @Autowired
    RegularClientService regularClientService;

    @GetMapping("/")
    public List<RegularClient> getAll(){
        return regularClientService.getAll();
    }

    @GetMapping("/{id}")
    public RegularClient getOne(@PathVariable String id){
        return regularClientService.get(id);
    }

    @PostMapping("/post")
    public RegularClient create(@RequestBody RegularClient regularClient){
        return regularClientService.create(regularClient);
    }

    @PutMapping("/put")
    public RegularClient update(@RequestBody RegularClient regularClient){
        return regularClientService.update(regularClient);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id){
        regularClientService.delete(id);
    }
}
