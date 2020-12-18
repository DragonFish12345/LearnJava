package com.dragonfish;

public class Email {
    String firstName;
    String lastName;
    int studentID;
    final String address;

    public Email(String firstName, String lastName, int studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.address = (firstName.toLowerCase()).substring(0, 3) + (lastName.toLowerCase()).substring(0, 3) + studentID%1000 + "@dragonfish.com";
    }
}
