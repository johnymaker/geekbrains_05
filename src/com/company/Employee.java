package com.company;

public class Employee {
    String name;
    String post;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String name, String post, String email, String phone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {}

    public void printEmployeeInfo() {
        System.out.println(name + ", " + post + ", " + email + ", " + phone + ", " + salary + ", " + age);
    }
}
