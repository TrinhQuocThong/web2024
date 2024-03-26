package model;

import java.sql.Timestamp;

public class Review {
    private int idProduct;
    private int idUser;
    private String content;
    private int startNumber;
    private Timestamp reviewDate;

    public Review(int idProduct, int idUser, String content, int startNumber, Timestamp reviewDate) {
        this.idProduct = idProduct;
        this.idUser = idUser;
        this.content = content;
        this.startNumber = startNumber;
        this.reviewDate = reviewDate;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(int startNumber) {
        this.startNumber = startNumber;
    }

    public Timestamp getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Timestamp reviewDate) {
        this.reviewDate = reviewDate;
    }
// Getters and Setters
}
