package com.app.kwesi;

public class User {



    private int id;
    private String Fullname;

    public User() {
    }



    public int getId() {
        return id;
    }

    public User(int id, String fullname, String emailAddress, String password, String phoneNumber, String DOB, String note) {
        this.id = id;
        Fullname = fullname;
        this.emailAddress = emailAddress;
        Password = password;
        this.phoneNumber = phoneNumber;
        this.DOB = DOB;
        Note = note;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String fullname) {
        Fullname = fullname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

    private String emailAddress;
    private  String Password;
    private String phoneNumber;
    private String DOB;
    private String Note;


}
