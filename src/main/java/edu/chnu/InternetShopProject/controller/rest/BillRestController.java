package edu.chnu.InternetShopProject.controller.rest;

import edu.chnu.InternetShopProject.model.Bill;
import edu.chnu.InternetShopProject.model.Client;
import edu.chnu.InternetShopProject.service.interfaces.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bills")
public class BillRestController {
    @Autowired
    BillService billService;
    @GetMapping("/")
    public List<Bill> getAll(){
        return billService.getAll();
    }

    @GetMapping("/{id}")
    public Bill getOne(@PathVariable String id){
        return billService.get(id);
    }

    @PostMapping("/post")
    public Bill create(@RequestBody Bill bill){
        return billService.create(bill);
    }

    @PutMapping("/put")
    public Bill update(@RequestBody Bill bill){
        return billService.update(bill);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id){
        billService.delete(id);
    }
}
