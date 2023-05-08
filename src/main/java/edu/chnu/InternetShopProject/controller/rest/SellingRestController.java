package edu.chnu.InternetShopProject.controller.rest;

import edu.chnu.InternetShopProject.model.Selling;
import edu.chnu.InternetShopProject.service.interfaces.SellingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sellings")
public class SellingRestController {
    @Autowired
    SellingService sellingService;
    @GetMapping ("/")
    public List<Selling> getAll(){
        return sellingService.getAll();
    }

    @GetMapping("/{id}")
    public Selling getOne(@PathVariable String id){
        return sellingService.get(id);
    }

    @PostMapping("/post")
    public Selling create(@RequestBody Selling selling){
        return sellingService.create(selling);
    }

    @PutMapping("/put")
    public Selling update(@RequestBody Selling selling){
        return sellingService.update(selling);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id){
        sellingService.delete(id);
    }
}
