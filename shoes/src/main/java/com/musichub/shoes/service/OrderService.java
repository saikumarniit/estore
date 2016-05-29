package com.musichub.shoes.service;

import com.musichub.shoes.model.UserOrder;

public interface OrderService {

    void addOrder(UserOrder order);

    double getOrderGrandTotal(int cartId);
}
