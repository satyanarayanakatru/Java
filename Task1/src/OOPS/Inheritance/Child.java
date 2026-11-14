package OOPS.Inheritance;

public class Child extends Parent{
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "nani";
        child.age = 34;
        System.out.println(child.name);
        System.out.println(child.age);
    }
}
