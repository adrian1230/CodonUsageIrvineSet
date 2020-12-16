package com.ifbooth.Entity;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "UserCart")
public class UserCart {
    private Integer userid;
    private String title;
    private Integer quantity;
    private Float final_price; // if there is a discount

    public Integer getUserid() {
        return userid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getFinal_price() {
        return final_price;
    }

    public void setFinal_price(Float final_price) {
        this.final_price = final_price;
    }
}
