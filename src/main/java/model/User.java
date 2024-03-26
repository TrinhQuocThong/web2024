package model;

import java.sql.Timestamp;

public class User {


    private int id;
    private String username;
    private String passwords;
    private String phoneNumber;
    private Timestamp accountCreationTime;
    private String firstName;
    private String lastName;
    private String images;
    private String sexual;
    private byte emailVerify;
    private int coin;
    private int idPayment;
    private int idShipment;
    private String saltString;
    private byte roles;
    private byte policyViolations;

    public User() {
    }

    public String getSaltString() {
        return saltString;
    }

    public void setSaltString(String saltString) {
        this.saltString = saltString;
    }

    public User(int id, String username, String passwords, String phoneNumber, Timestamp accountCreationTime, String firstName, String lastName, String images, String sexual, byte emailVerify, int coin, int idPayment, int idShipment, String saltString, byte roles, byte policyViolations) {
        this.id = id;
        this.username = username;
        this.passwords = passwords;
        this.phoneNumber = phoneNumber;
        this.accountCreationTime = accountCreationTime;
        this.firstName = firstName;
        this.lastName = lastName;
        this.images = images;
        this.sexual = sexual;
        this.emailVerify = emailVerify;
        this.coin = coin;
        this.idPayment = idPayment;
        this.idShipment = idShipment;
        this.saltString = saltString;
        this.roles = roles;
        this.policyViolations = policyViolations;
    }

    public User(int id, String username, String passwords, String phoneNumber, Timestamp accountCreationTime, String firstName, String lastName, String images, String sexual, byte emailVerify, int coin, String saltString, byte roles, byte policyViolations) {
        this.id = id;
        this.username = username;
        this.passwords = passwords;
        this.phoneNumber = phoneNumber;
        this.accountCreationTime = accountCreationTime;
        this.firstName = firstName;
        this.lastName = lastName;
        this.images = images;
        this.sexual = sexual;
        this.emailVerify = emailVerify;
        this.coin = coin;
        this.saltString = saltString;
        this.roles = roles;
        this.policyViolations = policyViolations;
    }

    public User(String username, String passwords, Timestamp accountCreationTime, byte emailVerify, String saltString, byte roles, byte policyViolations) {
        this.username = username;
        this.passwords = passwords;
        this.accountCreationTime = accountCreationTime;
        this.emailVerify = emailVerify;
        this.saltString = saltString;
        this.roles = roles;
        this.policyViolations = policyViolations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Timestamp getAccountCreationTime() {
        return accountCreationTime;
    }

    public void setAccountCreationTime(Timestamp accountCreationTime) {
        this.accountCreationTime = accountCreationTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getSexual() {
        return sexual;
    }

    public void setSexual(String sexual) {
        this.sexual = sexual;
    }

    public byte getEmailVerify() {
        return emailVerify;
    }

    public void setEmailVerify(byte emailVerify) {
        this.emailVerify = emailVerify;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        if (coin >= 0) {
            this.coin = coin;
        }

    }

    public int getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(int idPayment) {
        this.idPayment = idPayment;
    }

    public int getIdShipment() {
        return idShipment;
    }

    public void setIdShipment(int idShipment) {
        this.idShipment = idShipment;
    }


    public byte getRoles() {
        return roles;
    }

    public void setRoles(byte roles) {
        this.roles = roles;
    }

    public byte getPolicyViolations() {
        return policyViolations;
    }

    public void setPolicyViolations(byte policyViolations) {
        this.policyViolations = policyViolations;
    }

}
