package com.dragonfish;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the email formatter. ");
        String firstName, lastName;
        int studentID;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        firstName = scanner.next();
        System.out.print("Enter your last name: ");
        lastName = scanner.next();
        System.out.print("Enter your student ID: ");
        studentID = scanner.nextInt();
        Email email = new Email(firstName, lastName, studentID);
        System.out.println("Your formatted email address is: " + email.address);
    }
}
