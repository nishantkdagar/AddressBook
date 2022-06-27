package com.addressbook;

public class Contacts {
        private String firstName, lastName, address, city, state, pinCode, phoneNumber, email;
        public void Contacts() {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.pinCode = pinCode;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }
        public String getFirstName () {
            return firstName;
        }
        public void setFirstName (String firstName){
            this.firstName = firstName;
        }
        public String getLastName(){
            return lastName;
        }
        public  void setLastName(String lastName){
            this.lastName = lastName;
        }
        public String getAddress () {
            return address;
        }
        public void setAddress (String address){
            this.address = address;
        }
        public String getCity () {
            return city;
        }
        public void setCity (String city){
            this.city = city;
        }
        public String getState () {
            return state;
        }
        public void setState (String state){
            this.state = state;
        }
        public String getPinCode () {
            return pinCode;
        }
        public void setPinCode (String pinCode){
            this.pinCode = pinCode;
        }
        public String getPhoneNumber () {
            return phoneNumber;
        }
        public void setPhoneNumber (String phoneNumber){
            this.phoneNumber = phoneNumber;
        }
        public String getEmailAddress () {
            return email;
        }
        public void setEmailAddress (String email){
            this.email = email;
        }
    }