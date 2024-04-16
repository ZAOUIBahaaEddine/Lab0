package org.zaouibahaddin.EXO1;

public class PersonWrong {
    private String firstName;
    private String lastName;
    private int age;
    public PersonWrong(String firstName, String lastName, int age) {
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