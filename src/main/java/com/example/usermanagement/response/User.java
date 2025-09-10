package com.example.usermanagement.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
public class User {
    private int id;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    private String email;
    private String gender;
    private String birthdate;
    @JsonProperty("company_name")
    private String companyName;
    private String department;
    @JsonProperty("job_title")
    private String jobTitle;
    @JsonProperty("address")
    private List<Address> address;
    private String phone;
    private String avatar;
    @JsonProperty("email_verified")
    private boolean emailVerified;
    private String password;
    @JsonProperty("last_login")
    private String lastLogin;
    @JsonProperty("last_login_ip")
    private String lastLoginIp;
    private boolean subscribed;

    public User() {
    }

    public User(int id, String firstName, String lastName, String email, String gender, String birthdate, String companyName, String department, String jobTitle, List<Address> address, String phone, String avatar, boolean emailVerified, String password, String lastLogin, String lastLoginIp, boolean subscribed) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.birthdate = birthdate;
        this.companyName = companyName;
        this.department = department;
        this.jobTitle = jobTitle;
        this.address = address;
        this.phone = phone;
        this.avatar = avatar;
        this.emailVerified = emailVerified;
        this.password = password;
        this.lastLogin = lastLogin;
        this.lastLoginIp = lastLoginIp;
        this.subscribed = subscribed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public boolean isEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }
}
