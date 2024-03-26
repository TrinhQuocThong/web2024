package model;

public class UserAddress {
    private int id;
    private String houseNumber;
    private String district;
    private String subDistrict;
    private String city;
    private int idUser;

    public UserAddress(int id, String houseNumber, String district, String subDistrict, String city, int idUser) {
        this.id = id;
        this.houseNumber = houseNumber;
        this.district = district;
        this.subDistrict = subDistrict;
        this.city = city;
        this.idUser = idUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getSubDistrict() {
        return subDistrict;
    }

    public void setSubDistrict(String subDistrict) {
        this.subDistrict = subDistrict;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
// Getters and Setters



    //lấy địa chỉ của
}
