package com.ifbooth.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "User")
public class User {
    @Id
    private Integer userid;
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    @DBRef
    private List<FollowedNetworks> followedNetworks;
}
