package com.ifbooth.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "AllItems")
public class All_Items {
    @Id
    private Integer item_id;
    private String itemName;
    private String seller;
    private String description;
    private String img_link;
    private Float price;
    private Integer number_of_items_on_stock;
    private Boolean discount;
    private String category;
    private Float discount_value;

    public Integer getItem_Id() {
        return item_id;
    }

    public Integer getNumber_of_items_on_stock() {
        return number_of_items_on_stock;
    }

    public void setNumber_of_items_on_stock(Integer number_of_items_on_stock) {
        this.number_of_items_on_stock = number_of_items_on_stock;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg_link() {
        return img_link;
    }

    public void setImg_link(String img_link) {
        this.img_link = img_link;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Boolean getDiscount() {
        return discount;
    }

    public void setDiscount(Boolean discount) {
        this.discount = discount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Float getDiscount_value() {
        return discount_value;
    }

    public void setDiscount_value(Float discount_value) {
        this.discount_value = discount_value;
    }
}
