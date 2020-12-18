package com._.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class FollowedNetworks {
    @Id
    private String networkName;
    private Integer networkID;

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public Integer getNetworkID() {
        return networkID;
    }

    public void setNetworkID(Integer networkID) {
        this.networkID = networkID;
    }
}
