package edu.chnu.InternetShopProject.repository;

import edu.chnu.InternetShopProject.model.Delivery;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends MongoRepository<Delivery, String> {

}
