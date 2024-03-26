package model;

import java.sql.Timestamp;

public class OrderItem {
    private int id;
    private int idUser;
    private String paymentType;
    private String statusOrders;
    private String transactionType;
    private Timestamp dateCreateOrder;
    private Timestamp dateCancelOrder;

    // Getters and Setters


    public OrderItem(int id, int idUser, String paymentType, String statusOrders, String transactionType, Timestamp dateCreateOrder, Timestamp dateCancelOrder) {
        this.id = id;
        this.idUser = idUser;
        this.paymentType = paymentType;
        this.statusOrders = statusOrders;
        this.transactionType = transactionType;
        this.dateCreateOrder = dateCreateOrder;
        this.dateCancelOrder = dateCancelOrder;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getStatusOrders() {
        return statusOrders;
    }

    public void setStatusOrders(String statusOrders) {
        this.statusOrders = statusOrders;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Timestamp getDateCreateOrder() {
        return dateCreateOrder;
    }

    public void setDateCreateOrder(Timestamp dateCreateOrder) {
        this.dateCreateOrder = dateCreateOrder;
    }

    public Timestamp getDateCancelOrder() {
        return dateCancelOrder;
    }

    public void setDateCancelOrder(Timestamp dateCancelOrder) {
        this.dateCancelOrder = dateCancelOrder;
    }
}
