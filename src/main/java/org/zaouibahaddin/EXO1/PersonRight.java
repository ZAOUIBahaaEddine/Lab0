package org.zaouibahaddin.EXO1;

public class PersonRight {
    private String firstName;
    private String lastName;
    private int age;
    public PersonRight(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }
    public boolean isAdult() {
        return age >= 18;
    }
}