package com.example.usermanagement.request;

import com.example.usermanagement.response.Address;

import java.util.List;

public class UserRequest {
    private int id;
    private List<Address> address;
    private String phone;

    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public List<Address> getAddress() {
        return address;
    }
    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
