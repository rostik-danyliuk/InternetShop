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
public class RegularClient {
    private String id;
    private Client client;
    private LocalDate registration;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public RegularClient(Client client, LocalDate registration) {
        this.client = client;
        this.registration = registration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegularClient that = (RegularClient) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
