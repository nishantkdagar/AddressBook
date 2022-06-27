package com.addressbook;

public class AddressBookMain {
    public static void main(String[] args){
        System.out.println("Welcome to the Address Book Program");
        Contacts contacts = new Contacts();
        contacts.setFirstName("Nishant");
        System.out.println("First Name: "+contacts.getFirstName());
        contacts.setLastName("Kumar");
        System.out.println("Last Name: "+contacts.getLastName());
        contacts.setAddress("MIHAN");
        System.out.println("Address: "+contacts.getAddress());
        contacts.setCity("Nagpur");
        System.out.println("City: "+contacts.getCity());
        contacts.setState("Maharashtra");
        System.out.println("State: "+contacts.getState());
        contacts.setPinCode("411008");
        System.out.println("Pin Code: "+contacts.getPinCode());
        contacts.setPhoneNumber("9876543210");
        System.out.println("Contact Number: "+contacts.getPhoneNumber());
        contacts.setEmailAddress("nishant.kumar@bridgelabz.com");
        System.out.println("Email Address: "+contacts.getEmailAddress());
    }
}
