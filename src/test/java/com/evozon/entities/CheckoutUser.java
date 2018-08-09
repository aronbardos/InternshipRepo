package com.evozon.entities;

public class CheckoutUser {
    String firstname;
    String lastname;
    String address;
    String email;
    String city;
    String postalcode;
    String phone;
    int state;
    int country;

    public CheckoutUser(String firstname, String lastname, String address, String email, String city, String postalcode, String phone, int state, int country) {
        setFirstname(firstname);
        setLastname(lastname);
        setEmail(email);
        setCity(city);
        setPostalcode(postalcode);
        setPhone(phone);
        setState(state);
        setCountry(country);
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }
    public String getPostalcode() {
        return postalcode;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }
    public void setState(int state) {
        this.state = state;
    }
    public int getState() {
        return state;
    }
    public void setCountry(int country) {
        this.country = country;
    }
    public int getCountry() {
        return country;
    }
}
