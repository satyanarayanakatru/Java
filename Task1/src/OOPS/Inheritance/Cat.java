package OOPS.Inheritance;

public class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("meow meow");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
        cat.eat();
    }
}
