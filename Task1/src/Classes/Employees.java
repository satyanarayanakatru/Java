package Classes;

public class Employees{
    long monthlySalary;
    int totalMonths;
    void calculateSalary(){
        long totalSal = (monthlySalary * totalMonths);
        System.out.println(totalSal);
    }

    public static void main(String[] args){
        Employees employee1 = new Employees();

        employee1.monthlySalary = 400000L;
        employee1.totalMonths = 12;
        employee1.calculateSalary();
    }
}
