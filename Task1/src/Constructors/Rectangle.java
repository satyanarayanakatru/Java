package Constructors;

public class Rectangle {
    int length;
    int width;

    Rectangle(int len, int wid){
        length = len;
        width = wid;

        System.out.println("Area of rectangle is : " + length * width);
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(20,30);
        Example example1 = new Example("Satya", 24);


    }
}

class Example{
    String name;
    int age;

    Example(String fullName, int ages){
        this.name = fullName;
        this.age = ages;
        System.out.println(this.name);
        System.out.println(this.age);
    }



}
