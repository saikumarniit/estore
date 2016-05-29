package com.musichub.shoes.service;

import com.musichub.shoes.model.Cart;

public interface CartService {

    Cart getCartById (int cartId);

    void update(Cart cart);
}
