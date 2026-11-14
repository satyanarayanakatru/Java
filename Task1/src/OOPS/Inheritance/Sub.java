package OOPS.Inheritance;

public class Sub extends Super{
    String name ="child";

    public void display() {
        System.out.println(super.name);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.display();
    }
}


