package com.musichub.shoes.service;

import com.musichub.shoes.model.Cart;
import com.musichub.shoes.model.CartItem;

public interface CartItemService {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByItemId (int itemId);
}
