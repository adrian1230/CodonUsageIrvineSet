package com.ifbooth.DAO;

import com.ifbooth.Entity.UserCart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CartRepository extends MongoRepository<UserCart, String> {
    UserCart findFirstByName(String title);
}
