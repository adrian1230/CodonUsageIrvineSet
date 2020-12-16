package com.ifbooth.DAO;

import com.ifbooth.Entity.UserCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class CartDAO {

    @Autowired
    private CartRepository repository;
    public Collection<UserCart> getItemsFromCart() {
        return repository.findAll();
    }
}
