package com.zeeshan.rasool;

public class TaskBuilder {

    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String address;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }



    public TaskBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public TaskBuilder age(int age) {
        this.age = age;
        return this;
    }

    public TaskBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public TaskBuilder address(String address) {
        this.address = address;
        return this;
    }

    public Task build() {
        return new Task(this);
    }
}
