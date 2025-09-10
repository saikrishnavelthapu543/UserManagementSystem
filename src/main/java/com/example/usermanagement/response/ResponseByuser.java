package com.example.usermanagement.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResponseByuser {
@JsonProperty("Users")
private List<User> user;

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public ResponseByuser(List<User> user) {
        this.user = user;
    }

    public ResponseByuser() {
    }
}
