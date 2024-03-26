package model;

public class PromotionDetail {
    private int idUser;
    private int idProduct;
    private int idPromotion;
    private int countPromotion;

    public PromotionDetail(int idUser, int idProduct, int idPromotion, int countPromotion) {
        this.idUser = idUser;
        this.idProduct = idProduct;
        this.idPromotion = idPromotion;
        this.countPromotion = countPromotion;
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

    public int getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(int idPromotion) {
        this.idPromotion = idPromotion;
    }

    public int getCountPromotion() {
        return countPromotion;
    }

    public void setCountPromotion(int countPromotion) {
        this.countPromotion = countPromotion;
    }
// Getters and Setters
}
