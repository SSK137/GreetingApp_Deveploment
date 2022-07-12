package com.example.greetingapp.Module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Data {
    String firstName;
    String lastName;
    private Long id;

    public Data(Data data) {
        this.firstName=data.firstName;
        this.lastName=data.lastName;
    }

    public Data(String firstName, String lastName) {
    }

    public Data() {

    }

    public Data(Data data, Long id) {
        this.firstName=data.firstName;
        this.lastName=data.lastName;
        this.id=id;
    }

    public Data(Long id) {
        this.id=id;
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

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Data{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}
