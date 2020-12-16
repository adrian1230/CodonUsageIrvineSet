package com.ifbooth.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Networks")
public class All_Networks {
    @Id
    private Integer network_id;
    private String network_name;
    private Integer numberOfMember;
    private String category;
    private Float savedMoney;

    public Integer getNetwork_Id() {
        return network_id;
    }

    public String getNetwork_name() {
        return network_name;
    }

    public void setNetwork_name(String network_name) {
        this.network_name = network_name;
    }

    public Integer getNumberOfMember() {
        return numberOfMember;
    }

    public void setNumberOfMember(Integer numberOfMember) {
        this.numberOfMember = numberOfMember;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Float getSavedMoney() {
        return savedMoney;
    }

    public void setSavedMoney(Float savedMoney) {
        this.savedMoney = savedMoney;
    }
}
