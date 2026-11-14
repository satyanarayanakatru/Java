package OOPS.Inheritance;

public class Manager extends Employee{
    void manager(){
        System.out.println("this is manager class");
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.person();
        manager.employee();
        manager.manager();
    }
}
