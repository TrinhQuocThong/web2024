package model;

public class CategoryProduct {
    private int idCategories;
    private int idProduct;
    private String statusCategories;

    public CategoryProduct(int idCategories, int idProduct, String statusCategories) {
        this.idCategories = idCategories;
        this.idProduct = idProduct;
        this.statusCategories = statusCategories;
    }

    public int getIdCategories() {
        return idCategories;
    }

    public void setIdCategories(int idCategories) {
        this.idCategories = idCategories;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getStatusCategories() {
        return statusCategories;
    }

    public void setStatusCategories(String statusCategories) {
        this.statusCategories = statusCategories;
    }
// Getters and Setters
}
