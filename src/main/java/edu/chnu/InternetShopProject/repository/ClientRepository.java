package edu.chnu.InternetShopProject.repository;

import edu.chnu.InternetShopProject.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends MongoRepository<Client, String> {

}
