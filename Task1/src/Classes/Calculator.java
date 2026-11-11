package Classes;

public class Calculator {
    int num1;
    int num2;
    void add(){
        int sum = num1 + num2;
        System.out.println(sum);
    }
    void sub(){
        int minus = num1 - num2;
        System.out.println(minus);
    }

    public static void main(String[] args){
        Calculator calculator1 = new Calculator();
        calculator1.num1 = 120;
        calculator1.num2 = 40;
        calculator1.add();
        calculator1.sub();
    }
}
