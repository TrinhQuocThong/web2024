package model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Promotion {
    private int id;
    private String promotionName;
    private BigDecimal salePrice;
    private Timestamp dateCreate;
    private Timestamp dateEnd;
    private int duration;

    public Promotion(int id, String promotionName, BigDecimal salePrice, Timestamp dateCreate, Timestamp dateEnd, int duration) {
        this.id = id;
        this.promotionName = promotionName;
        this.salePrice = salePrice;
        this.dateCreate = dateCreate;
        this.dateEnd = dateEnd;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public Timestamp getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Timestamp dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Timestamp getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Timestamp dateEnd) {
        this.dateEnd = dateEnd;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
// Getters and Setters
}
