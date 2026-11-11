package Classes;

public class Student {

    String name;
    int age;
    String course;

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();

        // Giving values
        student1.name = "Satya";
        student1.age = 26;
        student1.course = "Java";

        student2.name = "Nani";
        student2.age = 30;
        student2.course = "React";

        // Printing values
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.course);
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.course);
    }


}


class Employee {
    String name;
    long empCode;
    String role;


    public  void main(String[] args){
        Employee emp1 = new Employee();

        emp1.name = "pavan";
        emp1.empCode = 1826;
        emp1.role = "Developer";

        System.out.println(emp1.name);
        System.out.println(emp1.empCode);
        System.out.println(emp1.role);
    }

}