public class Operators {

    public static void main(String[] args) {

//        Exercise 1 – Arithmetic Operators

        int a = 25;
        int b = 4;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));


//        Exercise 2 – Even or Odd

        int number = 17;

        if (number % 2 == 0) {
            System.out.println("Given number is even");
        } else {
            System.out.println("Given number is odd");
        }

//        Exercise 3 – Positive, Negative or Zero
        int numbers = 0;

        if (numbers > 0) {
            System.out.println("Given number is positive");
        } else if (numbers < 0) {
            System.out.println("Given number is negative");
        } else {
            System.out.println("Given number is zero");
        }

//        Exercise 4 – Student Grade

        int marks = 184;

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
        } else if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

//        5. Largest of Four Numbers

        int r = 70;
        int t = 40;
        int g = 50;
        int h = 80;


        if (r > t && r > g && r > h) {
            System.out.println("R is largest");
        } else if (t > r && t > g && t > h) {
            System.out.println("T is largest");

        } else if (g > r && g > t && g > h) {
            System.out.println("G is largest");

        } else {
            System.out.println("H is largest");

        }


//        Exercise 6 – Logical Operators

        int age = 16;
        boolean hasLicense = true;

        if (age >= 18 && hasLicense) {
            System.out.println("He is eligible");
        } else {
            System.out.println("Not eligible");
        }

//        Exercise 7 – Simple Calculator

        int x = 20;
        int y = 10;
        char operator = '+';

        switch (operator) {

            case '+':
                System.out.println((x + y));
                break;

            case '*':
                System.out.println(x * y);
                break;

            case '-':
                System.out.println(x - y);
                break;
            case '/':
                if (y != 0) {
                    System.out.println(x / y);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            case '%':
                System.out.println(x % y);
                break;
            default:
                System.out.println("Invalid operator");


        }

//        Exercise 8 – Electricity Bill


        int units = 250;
        int bill = 0;

        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = (100 * 2 + (units - 100) * 3);

        } else {
            bill = (100 * 2 + 100 * 3 + (units - 200) * 5);

        }

        System.out.println("Electricity bill : " + bill);
    }
}
