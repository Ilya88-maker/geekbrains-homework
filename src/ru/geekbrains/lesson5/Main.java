package ru.geekbrains.lesson5;

public class Main {

    private static final int  MAX_AGE = 40;


    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("FIO1", "Pos1", "Email1", "5555", "25000",
                "39");
        employees[1] = new Employee("FIO2", "Pos2", "Email1", "4444", "45000",
                "35");
        employees[2] = new Employee("FIO3", "Pos3", "Email1", "3333", "60000",
                "31");
        employees[3] = new Employee("FIO4", "Pos4", "Email1", "2222", "80000",
                "45");
        employees[4] = new Employee("FIO5", "Pos5", "Email1", "1111", "100000",
                "42");

        for (Employee employee:employees){
            if (Employee.getAge() > MAX_AGE){
                System.out.println(Employee);
            }
        }
    }
}
