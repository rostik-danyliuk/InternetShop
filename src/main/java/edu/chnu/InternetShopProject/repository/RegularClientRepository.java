package edu.chnu.InternetShopProject.repository;

import edu.chnu.InternetShopProject.model.RegularClient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegularClientRepository extends MongoRepository<RegularClient, String> {

}
