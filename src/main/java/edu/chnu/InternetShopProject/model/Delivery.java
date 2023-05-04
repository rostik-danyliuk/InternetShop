package edu.chnu.InternetShopProject.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Delivery {
    private String id;
    private Selling selling;
    private LocalDate departure;
    private LocalDate accept;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Delivery(Selling selling, LocalDate departure, LocalDate accept) {
        this.selling = selling;
        this.departure = departure;
        this.accept = accept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Delivery delivery = (Delivery) o;
        return Objects.equals(id, delivery.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
