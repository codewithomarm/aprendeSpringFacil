package com.codewithomar.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component(value = "clientOmar")
public class Client {
    private String firstName;
    private String lastName;

    public Client() {}

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @PostConstruct
    public void clientInitialize(){
        this.firstName = "Omar";
        this.lastName = "Montoya";
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

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
