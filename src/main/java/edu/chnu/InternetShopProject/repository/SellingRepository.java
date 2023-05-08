package edu.chnu.InternetShopProject.repository;

import edu.chnu.InternetShopProject.model.Selling;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellingRepository extends MongoRepository<Selling, String> {

}
