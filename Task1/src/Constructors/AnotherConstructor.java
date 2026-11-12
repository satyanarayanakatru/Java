package Constructors;

public class AnotherConstructor {

    AnotherConstructor(){
        System.out.println("This is first constructor");
    }

    AnotherConstructor(String name){
        this();
        System.out.println("Name is: " + name);

        System.out.println("This is second construnctor");
    }

    public static void main(String[] args) {
        AnotherConstructor anotherConstructor1 = new AnotherConstructor("nani");
    }
}
