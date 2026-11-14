package OOPS.Encapsulation;

public class Employee {
    private String employeeName;
    private int salary;

    public void setEmployeeDetails(String name, int sal){
        this.employeeName = name;
        this.salary = sal;
    }

    public void getEmployeeDetails(){
        System.out.println(employeeName);
        System.out.println(salary);
    }
}
