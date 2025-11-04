package com.example.twitxclone.model;

public class User {
    static final String E_KEY = "EMAIL";
    static final String DOB_KEY = "DOB";
    private String email;
    private String dob;

    public String getName() {
        return email;
    }

    public void setName(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
