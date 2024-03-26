package model;

import java.math.BigDecimal;

public class OrderDetails {
    private int idOrder;
    private int idProduct;
    private double price;
    private int quantity;

    // Getters and Setters

    public OrderDetails(int idOrder, int idProduct, double price, int quantity) {
        this.idOrder = idOrder;
        this.idProduct = idProduct;
        this.price = price;
        this.quantity = quantity;
    }


    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
