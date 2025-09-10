package com.example.usermanagement.userproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "user.api")
public class UserApiProperties {
    private String baseUrl;
    private Endpoints endpoints;
    public static class Endpoints {

        private String users;
        private String usersbyid;
        private String postuser;

        public String getUsers() {
            return users;
        }

        public void setUsers(String users) {
            this.users = users;
        }

        public String getUsersbyid() {
            return usersbyid;
        }

        public void setUsersbyid(String usersbyid) {
            this.usersbyid = usersbyid;
        }

        public String getPostuser() {
            return postuser;
        }

        public void setPostuser(String postuser) {
            this.postuser = postuser;
        }
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public Endpoints getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(Endpoints endpoints) {
        this.endpoints = endpoints;
    }
}
