package com.company;

public class Main {

    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5];

        emplArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivanov@mailbox.com", "89231231212", 30000, 30);
        emplArray[1] = new Employee("Stepanov Dmitriy", "Engineer", "sdmitriy@mailbox.com", "89231231212", 30000, 42);
        emplArray[2] = new Employee("Peshiy Nikolay", "Engineer", "pnikolay@mailbox.com", "89231231212", 30000, 37);
        emplArray[3] = new Employee("Petrov Vasiliy", "Engineer", "petrvasya@mailbox.com", "89231231212", 30000, 49);
        emplArray[4] = new Employee("Sidorov Artem", "Engineer", "sidartem@mailbox.com", "89231231212", 30000, 30);

        // Выводим в консоль информацию обо всех сотрудниках
        for (Employee e : emplArray) {
            e.printEmployeeInfo();
        }

        System.out.println("\nСотрудники старше 40 лет:");

        // Выводим информацию только о сотрудниках, старше 40 лет
        for (Employee e : emplArray) {
            if (e.age >= 40) e.printEmployeeInfo();
        }
    }
}
