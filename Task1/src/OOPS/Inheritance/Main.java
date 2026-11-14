package OOPS.Inheritance;

public class Main extends  Developer{

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.employeeName);
        System.out.println(main.salary);
        main.writeCode();
    }
}
