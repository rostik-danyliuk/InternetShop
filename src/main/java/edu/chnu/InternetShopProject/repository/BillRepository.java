package edu.chnu.InternetShopProject.repository;

import edu.chnu.InternetShopProject.model.Bill;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends MongoRepository<Bill, String> {

}
