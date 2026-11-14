package OOPS.Encapsulation;

public class Person {

    private int age;

    public void setAge(int ages) {
        if (ages > 18) {
            this.age = ages;

        } else {
            System.out.println("Invalid age");
        }
    }

    public void getAge(){
        System.out.println(age);

    }
}
