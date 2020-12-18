package com._.DAO;

import com._.Entity.UserCart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepository extends MongoRepository<UserCart, String> {
    UserCart findFirstByName(String title);
}
