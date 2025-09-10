package com.example.usermanagement.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class UserResponse {
    private UserData userData;
  
    private String createdAt;
    @JsonProperty("UpdatedAt")
    private String updated;

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updated;
    }

    public void setUpdatedAt(String updatedAt) {
        updated = updatedAt;
    }
}
