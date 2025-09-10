package com.example.usermanagement.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseById {
    @JsonProperty("User")
    private User user;
}
