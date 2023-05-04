package edu.chnu.InternetShopProject.service.impls;

import edu.chnu.InternetShopProject.model.*;
import edu.chnu.InternetShopProject.model.enums.Regular;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BillServiceImpl {
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
