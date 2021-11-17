package com.bridgelabz.addressbooksystem;

public class ContactPerson {
    private String firstName;
    private String lastName;
    private String city;
    private String address;
    private String state;
    private String email;
    private String phoneNumber;
    private long pinCode;

    /**
     * Create Constructor for Initializing the objects
     */
    ContactPerson(String firstName, String lastName, String address, String city, String state, long pinCode,
                 String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    /**
     * Create Method for implementing getter and setter
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public void setZip(int zip) {
        this.pinCode = zip;
    }

    public long getZip() {
        return pinCode;
    }

    public void setPhn(String phn) {
        this.phoneNumber = phn;
    }

    public String getPhn() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return "ContactPerson{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", address='"
                + address + '\'' + ", city='" + city + '\'' + ", state='" + state + '\'' + ", eMail='" + email + '\''
                + ", phoneNumber='" + phoneNumber + '\'' + ", zipCode=" + pinCode + '}';
    }


}




