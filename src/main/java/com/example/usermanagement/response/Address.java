package com.example.usermanagement.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {
    private String street;
    @JsonProperty("street_name")
    private String streetName;
    private String city;
    private String state;
    private String country;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("postal_code")
    private String postalCode;

    public Address() {
    }

    public Address(String street, String streetName, String city, String state, String country, String countryCode, String postalCode) {
        this.street = street;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.countryCode = countryCode;
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
