package com.musichub.shoes.model;


import javax.persistence.*;
import java.io.Serializable;


@Entity
public class CartItem implements Serializable{

    private static final long serialVersionUID = 14L;

    @Id
    @GeneratedValue
    private int cartItemId;

    @ManyToOne
    @JoinColumn(name = "cartId")
 
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "itemId")
    private Product item;
    public Product getItem() {
		return item;
	}
	public void setItem(Product item) {
		this.item = item;
	}

	private int quantity;
    private double totalPrice;

    public int getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(int cartItemId) {
        this.cartItemId = cartItemId;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

   

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
