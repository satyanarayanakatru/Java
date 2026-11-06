public class Methods {
    public static void main(String[] args) {
        greet();
        sum(33, 44);
        sub(43, 30);
        System.out.println(age());
        System.out.println(square(4));
        check(232);
        System.out.println(largest(21, 343, 666));
        System.out.println(factorial(5));
        System.out.println("Addition: " + calculator(20, 10, '+'));
        System.out.println("Subtraction: " + calculator(20, 10, '-'));
        System.out.println("Multiplication: " + calculator(20, 10, '*'));
        System.out.println("Division: " + calculator(20, 10, '/'));
        System.out.println("Modulus: " + calculator(20, 10, '%'));
    }

    public static void greet() {
        System.out.println("Hello Java");
        details();

    }


    public static void details() {
        System.out.println("Name: Satyanarayana");
        System.out.println("Age: 26");

    }

    public static void sum(int a, int b) {
        System.out.println("Sum of a and b is: " + (a + b));
    }

    public static void sub(int a, int b) {
        System.out.println("Subtraction of a and b is: " + (a - b));
    }


    public static int age() {
        return 26;
    }

    public static int square(int a) {
        return a * a;
    }

    public static void check(int num) {
        if (num % 2 == 0) {
            System.out.println("Given number is even");
        } else {
            System.out.println("Given number is odd");
        }
    }


    public static int largest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }


    public static long factorial(int num) {

        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }


    public static double calculator(int a, int b, char operator) {

        switch (operator) {

            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                if (b != 0) {
                    return (double) a / b;
                } else {
                    System.out.println("Cannot divide by zero");
                    return 0;
                }

            case '%':
                if (b != 0) {
                    return a % b;
                } else {
                    System.out.println("Cannot divide by zero");
                    return 0;
                }

            default:
                System.out.println("Invalid operator");
                return 0;
        }
    }


}
