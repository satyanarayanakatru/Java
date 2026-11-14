package OOPS.Encapsulation;

public class Rectangle {
    private int length;
    private int width;

    public void setData (int length, int width){
        this.length = length;
        this.width = width;
    }

    public int calculateArea () {
            int area = length * width;

        System.out.println("Rectangle Area: " + area);
        return area;



    }
}
