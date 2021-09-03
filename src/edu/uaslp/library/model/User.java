package edu.uaslp.library.model;

import java.time.LocalDate;

public class User {
    private String name;
    private String code;
    private String phone;
    private String email;
    private String addres;
    private LocalDate registerDate;

    //methods
    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    //Getters

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddres() {
        return addres;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }
}
