package org.example;

public class User {
    private String userRoles;

    public User(String userRoles) {
        this.userRoles = userRoles;
    }

    public String getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(String userRoles) {
        this.userRoles = userRoles;
    }
}
