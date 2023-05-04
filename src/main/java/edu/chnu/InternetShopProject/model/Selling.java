package edu.chnu.InternetShopProject.model;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Selling {
    private String id;
    private Client client;
    private Product product;
    private LocalDate dateOfSale;
    private double discount;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Selling(Client client, Product product, LocalDate dateOfSale, double discount) {
        this.client = client;
        this.product = product;
        this.dateOfSale = dateOfSale;
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Selling selling = (Selling) o;
        return Objects.equals(id, selling.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
