package Classes;

public class Rectangle {
    int length;
    int width;
    void calculateArea () {
        int area = length * width;
        System.out.println(area);
    }


    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = 20;
        rectangle1.width = 55;
        rectangle1.calculateArea();
    }
}
