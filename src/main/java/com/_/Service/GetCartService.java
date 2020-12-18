package com._.Service;

import com._.DAO.CartDAO;
import com._.Entity.UserCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class GetCartService {
    @Autowired
    private CartDAO cartDAO;

    public Collection<UserCart> getItemsFromCart() {
        return cartDAO.getItemsFromCart();
    }
}


