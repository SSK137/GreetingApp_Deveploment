package com.example.greetingapp.Module;

public class Data {
    String firstName;
    String lastName;

    public Data(Data data) {
        this.firstName=data.firstName;
        this.lastName=data.lastName;
    }

    public Data() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
