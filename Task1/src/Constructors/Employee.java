package Constructors;

public class Employee {

    String fullName;
    int salary;

    Employee(String name, int sal){
        fullName = name;
        salary = sal;
    }
    public static void main(String[] args) {
        Employee employee1 = new Employee("Satya", 22222);
        Employee employee2 = new Employee("Nani", 2324323);
        System.out.println(employee1.fullName);
        System.out.println(employee1.salary);
        System.out.println(employee2.fullName);
        System.out.println(employee2.salary);
    }
}
