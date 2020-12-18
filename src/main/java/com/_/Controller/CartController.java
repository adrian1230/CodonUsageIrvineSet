package com._.Controller;

import com._.Entity.UserCart;
import com._.Service.GetCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private GetCartService getCartService;

    @GetMapping
    public Collection<UserCart> getItemsFromCart() {
        return getCartService.getItemsFromCart();
    }

//    @PostMapping
//    public UserCart postCart(@RequestBody UserCart user_cart) {
//        return getCartService.addItems2Cart();
//    }

}
