package com.example.domain;

public class MyPojo {

    private String location;

    private int pincode;

    public MyPojo() {
    }

    public MyPojo(String location, int pincode) {
        this.location = location;
        this.pincode = pincode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
