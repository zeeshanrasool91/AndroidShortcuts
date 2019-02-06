package com.zeeshan.rasool;

public class Task {

    //https://jlordiales.me/2012/12/13/the-builder-pattern-in-practice/
    private String firstName; // required
    private String lastName; // required
    private int age; // optional
    private String phone; // optional
    private String address; // optional

    Task(TaskBuilder builder) {
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.age = builder.getAge();
        this.phone = builder.getPhone();
        this.address = builder.getAddress();
    }

    @Override
    public String toString() {
        return "firstName = " + this.firstName + ", lastName = " + this.lastName +
                ", age = " + this.age + ", phone = " + this.phone + ", address = " + this.address;
    }
}