package edu.chnu.InternetShopProject.model;

import edu.chnu.InternetShopProject.model.enums.Regular;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
public class Client {
    @Id
    private  String id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String address;
    private String phoneNumber;
    private String eMail;
    private Regular regular;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Client(String lastName, String firstName, String patronymic, String address, String phoneNumber,
                  String eMail, Regular regular) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
        this.regular = regular;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
