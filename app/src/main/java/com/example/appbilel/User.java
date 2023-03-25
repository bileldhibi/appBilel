package com.example.appbilel;

public class User {
    String nomprénom, email, cin, tfn;

    public User() {

    }

    public User(String nomprénom, String email, String cin, String tfn) {
        this.nomprénom = nomprénom;
        this.email = email;
        this.cin = cin;
        this.tfn = tfn;

    }

    public String getNomprénom() {
        return nomprénom;
    }

    public void setNomprénom(String nomprénom) {
        this.nomprénom = nomprénom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getTfn() {
        return tfn;
    }

    public void setTfn(String tfn) {
        this.tfn = tfn;
    }


}
