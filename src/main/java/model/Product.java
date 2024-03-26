package model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Product {
    private int id;
    private String nameProduct;
    private double price;
    private double salePrice;
    private String productInformation;
    private Timestamp dateOfManufacture;
    private Timestamp dateExpiry;
    private int quantity;
    private String origin;
    private String trademark;
    private int weightProduct;
    private int ageOfUse;
    private String display;
    private String statusProduct;

    public Product(int id, String nameProduct, double price, double salePrice, String productInformation, Timestamp dateOfManufacture, Timestamp dateExpiry, int quantity, String origin, String trademark, int weightProduct, int ageOfUse, String display, String statusProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.salePrice = salePrice;
        this.productInformation = productInformation;
        this.dateOfManufacture = dateOfManufacture;
        this.dateExpiry = dateExpiry;
        this.quantity = quantity;
        this.origin = origin;
        this.trademark = trademark;
        this.weightProduct = weightProduct;
        this.ageOfUse = ageOfUse;
        this.display = display;
        this.statusProduct = statusProduct;
    }

    public Product(int id, String nameProduct, double price, double salePrice, String productInformation, Timestamp dateOfManufacture, Timestamp dateExpiry, int quantity, String origin, String trademark, int weightProduct, int ageOfUse) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.salePrice = salePrice;
        this.productInformation = productInformation;
        this.dateOfManufacture = dateOfManufacture;
        this.dateExpiry = dateExpiry;
        this.quantity = quantity;
        this.origin = origin;
        this.trademark = trademark;
        this.weightProduct = weightProduct;
        this.ageOfUse = ageOfUse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public String getProductInformation() {
        return productInformation;
    }

    public void setProductInformation(String productInformation) {
        this.productInformation = productInformation;
    }

    public Timestamp getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(Timestamp dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public Timestamp getDateExpiry() {
        return dateExpiry;
    }

    public void setDateExpiry(Timestamp dateExpiry) {
        this.dateExpiry = dateExpiry;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public int getWeightProduct() {
        return weightProduct;
    }

    public void setWeightProduct(int weightProduct) {
        this.weightProduct = weightProduct;
    }

    public int getAgeOfUse() {
        return ageOfUse;
    }

    public void setAgeOfUse(int ageOfUse) {
        this.ageOfUse = ageOfUse;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getStatusProduct() {
        return statusProduct;
    }

    public void setStatusProduct(String statusProduct) {
        this.statusProduct = statusProduct;
    }
}