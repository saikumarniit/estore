package com.musichub.shoes.dao;



import java.io.IOException;

import com.musichub.shoes.model.Cart;


public interface CartDao {

    Cart getCartById (int cartId);

    Cart validate(int cartId) throws IOException;

    void update(Cart cart);
}
