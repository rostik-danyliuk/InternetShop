package edu.chnu.InternetShopProject.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bill {
    private String id;
    private Client client;
    private List<Selling> sellingList;
    private List<Product> productList;
    private double discount;
    private double totalSum;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Bill(Client client, List<Selling> sellingList, List<Product> productList,
                double discount, double totalSum) {
        this.client = client;
        this.sellingList = sellingList;
        this.productList = productList;
        this.discount = discount;
        this.totalSum = totalSum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bill bill = (Bill) o;
        return Objects.equals(id, bill.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
