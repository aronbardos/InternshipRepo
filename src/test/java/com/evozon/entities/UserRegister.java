package com.evozon.entities;

public class UserRegister {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String confirmation;

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return confirmation;
    }
    public void setPassword(String confirmation) {
        this.password = confirmation;
    }

    @Override
    public String toString() {
        return "User [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", password=" + password
                + ", confirmation=" + confirmation + "]";
    }
}
