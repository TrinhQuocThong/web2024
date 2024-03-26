package model;

import java.sql.Timestamp;

public class Feedback {
    private int idUser;
    private int idProduct;
    private String content;
    private Timestamp dateFeedbacks;

    public Feedback(int idUser, int idProduct, String content, Timestamp dateFeedbacks) {
        this.idUser = idUser;
        this.idProduct = idProduct;
        this.content = content;
        this.dateFeedbacks = dateFeedbacks;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getDateFeedbacks() {
        return dateFeedbacks;
    }

    public void setDateFeedbacks(Timestamp dateFeedbacks) {
        this.dateFeedbacks = dateFeedbacks;
    }
// Getters and Setters
}
