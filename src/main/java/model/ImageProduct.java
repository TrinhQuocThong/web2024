package model;

import java.sql.Timestamp;

public class ImageProduct {
    private int id;
    private String imageName;
    private String sourceImage;
    private int idProduct;
    private Timestamp dateCreate;

    public ImageProduct(int id, String imageName, String sourceImage, int idProduct, Timestamp dateCreate) {
        this.id = id;
        this.imageName = imageName;
        this.sourceImage = sourceImage;
        this.idProduct = idProduct;
        this.dateCreate = dateCreate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getSourceImage() {
        return sourceImage;
    }

    public void setSourceImage(String sourceImage) {
        this.sourceImage = sourceImage;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public Timestamp getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Timestamp dateCreate) {
        this.dateCreate = dateCreate;
    }

    // Getters and Setters
}



