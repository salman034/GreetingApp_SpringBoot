package com.bridglabz.greetingappapplication.model;

import lombok.Data;

@Data
public class User {
    String firstName;
    String lastName;

    @Override
    public String toString() {
        String str = (firstName != null) ? firstName + " " : "";
        str += (lastName != null) ? lastName : "";
        return str.trim();
    }
}