package model;

import java.sql.Timestamp;

public class Category {
    private int id;
    private String nameCategories;
    private Timestamp dateCreate;

    public Category(int id, String nameCategories, Timestamp dateCreate) {
        this.id = id;
        this.nameCategories = nameCategories;
        this.dateCreate = dateCreate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCategories() {
        return nameCategories;
    }

    public void setNameCategories(String nameCategories) {
        this.nameCategories = nameCategories;
    }

    public Timestamp getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Timestamp dateCreate) {
        this.dateCreate = dateCreate;
    }
// Getters and Setters
}
