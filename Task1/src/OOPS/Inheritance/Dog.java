package OOPS.Inheritance;

public class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("bow bow");
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.sound();
    }
}
