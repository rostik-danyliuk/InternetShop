package edu.chnu.InternetShopProject.service.impls;

import edu.chnu.InternetShopProject.model.*;
import edu.chnu.InternetShopProject.model.enums.Regular;
import edu.chnu.InternetShopProject.repository.BillRepository;
import edu.chnu.InternetShopProject.service.interfaces.BillService;
import edu.chnu.InternetShopProject.service.interfaces.ClientService;
import edu.chnu.InternetShopProject.service.interfaces.ProductService;
import edu.chnu.InternetShopProject.service.interfaces.SellingService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class BillServiceImpl implements BillService {
    @Autowired
    BillRepository repository;

    @Autowired
    ClientService clientService;

    @Autowired
    SellingService sellingService;

    @Autowired
    ProductService productService;

    //@PostConstruct
    public void init(){
        repository.save(new Bill(clientService.get("6453d8e03a5c95e01fbb8700"),
                sellingService.getAll(),
                productService.getAll(),
                getTotalDiscount(clientService.get("6453d8e03a5c95e01fbb8700"),
                        sellingService.getAll()),
                getTotalSum(clientService.get("6453d8e03a5c95e01fbb8700"),
                        sellingService.getAll(),
                        productService.getAll())));
    }

    @Override
    public Bill create(Bill bill) {
        bill.setCreatedAt(LocalDateTime.now());
        return repository.save(bill);
    }

    @Override
    public List<Bill> getAll() {
        return repository.findAll();
    }

    @Override
    public Bill get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Bill update(Bill bill) {
        String id = bill.getId();
        Bill bill1 = this.get(id);
        bill.setCreatedAt(bill1.getCreatedAt());
        bill.setUpdatedAt(LocalDateTime.now());
        return repository.save(bill);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    private double getTotalDiscount(Client client, List<Selling> sellingList){
        double discount1 = 0.0;
        double discount2 = 0.0;
        if(client.getRegular() == Regular.REGULAR){
            discount1 = 0.02;
        }
        if(sellingList.stream().mapToDouble(selling -> selling.getProduct().getPrice()).sum() > 5000){
            discount2 = 0.03;
        }
        return discount1 + discount2;
    }
    private double getTotalSum(Client client, List<Selling> sellingList, List<Product> productList){
        double suma = productList.stream().mapToDouble(Product::getPrice).sum();
        return suma - suma * getTotalDiscount(client, sellingList);
    }
    public void getBill(Client client, List<Selling> sellingList, List<Product> productList){
        Bill bill = new Bill();
        bill.setClient(client);
        bill.setSellingList(sellingList);
        double discount1 = 0;
        double discount2 = 0;
        if(client.getRegular() == Regular.REGULAR){
            discount1 = 0.02;
        }
        if(sellingList.stream().mapToDouble(selling -> selling.getProduct().getPrice()).sum() > 5000){
            discount2 = 0.03;
        }
        bill.setDiscount(discount1 + discount2);
        bill.setTotalSum(getTotalSum(client, sellingList, productList));

    }

}
