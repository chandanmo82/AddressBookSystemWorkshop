package com.bridgelabz.addressbooksystem;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class AddressBook {
    public static List<ContactPerson> person = new ArrayList<ContactPerson>();
    Scanner sc = new Scanner(System.in);
    String firstName, lastName, address, city, state, email;
    int pinCode;
    String phoneNumber;
    void addContact(){
        System.out.println("Your First Name ");
        firstName = sc.next();
        System.out.println("Your Last Name");
        lastName = sc.next();
        System.out.println("Your Address");
        address = sc.next();
        System.out.println("Your City");
        city = sc.next();
        System.out.println("Your State");
        state = sc.next();
        System.out.println("Enter your Mailid");
        email = sc.next();
        System.out.println("Enter Your PinCode");
        pinCode = sc.nextInt();
        System.out.println("Enter PhoneNumber");
        phoneNumber = sc.next();
        person.add(new  ContactPerson(firstName, lastName, address, city, state, pinCode, email, phoneNumber));
        System.out.println(person);
    }



}
