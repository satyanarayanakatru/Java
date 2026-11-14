package OOPS.Encapsulation;

public class Student {

    private String name;
    private int age;

    public void setDetails(String fullName, int fullAge){
        this.name = fullName;
        this.age = fullAge;
    }

    public void getDetails () {
        System.out.println(name);
        System.out.println(age);
    }
}
