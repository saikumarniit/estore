package com.musichub.shoes.dao;

import com.musichub.shoes.model.Cart;
import com.musichub.shoes.model.CartItem;

public interface CartItemDao {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByItemId (int itemId);

}
