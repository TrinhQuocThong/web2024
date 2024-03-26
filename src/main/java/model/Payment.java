package model;

import java.sql.Timestamp;

public class Payment {
    private int id;
    private String paymentsName;
    private String accountNumber;
    private String bankName;
    private Timestamp paymentDate;

    public Payment(int id, String paymentsName, String accountNumber, String bankName, Timestamp paymentDate) {
        this.id = id;
        this.paymentsName = paymentsName;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.paymentDate = paymentDate;
    }

    // Getters and Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaymentsName() {
        return paymentsName;
    }

    public void setPaymentsName(String paymentsName) {
        this.paymentsName = paymentsName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Timestamp getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Timestamp paymentDate) {
        this.paymentDate = paymentDate;
    }
}
