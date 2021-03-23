package ru.geekbrains.lesson5;

public class Employee {

    public String FullName;
    public String Position;
    public int number;
    public int salary;
    public int age;

    public Employee(String FullName, String Position, int number, int salary, int age ){

        this.FullName = FullName;
        this.Position = Position;
        this.number = number;
        this.salary = salary;
        this.age = age;

    }

    public Employee() {

    }

    public static void createInformation() {

        Employee Employee1 = new Employee();

    }

    public static void main(String[] args) {

    }
}
