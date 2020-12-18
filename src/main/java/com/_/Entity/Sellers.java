package com._.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ProductProviders")
public class Sellers {
    @Id
    private Integer sellerid;
    private String brandNAME; // can be a person's name or a brand's name like GOOGLE
    private String category;
    private Integer numberOfSellingItems;
    private Float earning;

    public Integer getSellerid() {
        return sellerid;
    }

    public String getBrandNAME() {
        return brandNAME;
    }

    public void setBrandNAME(String brandNAME) {
        this.brandNAME = brandNAME;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getNumberOfSellingItems() {
        return numberOfSellingItems;
    }

    public void setNumberOfSellingItems(Integer numberOfSellingItems) {
        this.numberOfSellingItems = numberOfSellingItems;
    }

    public Float getEarning() {
        return earning;
    }

    public void setEarning(Float earning) {
        this.earning = earning;
    }
}
