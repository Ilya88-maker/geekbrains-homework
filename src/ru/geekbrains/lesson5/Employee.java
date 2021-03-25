package ru.geekbrains.lesson5;

public class Employee {

    private String fio;
    private String Position;
    private String email;
    private int number;
    private int salary;
    private int age;



    public Employee(String fio, String Position, String email, int number, int salary, int age ){
        this.fio = fio;
        this.Position = Position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;

    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", Position='" + Position + '\'' +
                ", email='" + email + '\'' +
                ", number=" + number +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }


}









