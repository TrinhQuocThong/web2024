package model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Shipments {
    private int id;
    private String shippingName;
    private double price;
    private Timestamp intendTime;
    private String city;

    public Shipments(int id, String shippingName, double price, Timestamp intendTime, String city) {
        this.id = id;
        this.shippingName = shippingName;
        this.price = price;
        this.intendTime = intendTime;
        this.city = city;
    }
// Getters and Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Timestamp getIntendTime() {
        return intendTime;
    }

    public void setIntendTime(Timestamp intendTime) {
        this.intendTime = intendTime;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

