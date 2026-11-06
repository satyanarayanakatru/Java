public class Loops {
    public static void main(String[] args) {
//        1. Print numbers from 1 to 10 using for loop

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

//        2. Print even numbers from 1 to 50

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even numbers: " + i);
            }
        }


//        3. Print multiplication table of 5

        for (int i = 1; i <= 10; i++) {
            System.out.println(i * 5);
        }

//        4. Calculate sum of numbers from 1 to 100

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println(sum);


//        5. Print numbers from 10 to 1 using while loop

        int k = 10;


        while (k >= 1) {
            System.out.println(k);
            k--;
        }

//        6. Calculate factorial of a number

        int fact = 1;


        for (int j = 1; j <= 5; j++) {
            fact *= j;
        }

        System.out.println("Factorial: " + fact);


//        7. Print a multiplication table using while loop

        int num = 1;

        while (num <= 10) {
            System.out.println("Multiplication: " + 9 * num);
            num++;
        }

//        8. Demonstrate do-while with a condition that is initially false


        boolean userLogin = true;
        int count = 1;

        do {
            System.out.println("Successfully login");
            count++;
        } while (userLogin && count <= 3);


//        9. Print numbers 1 to 10 but skip 5 using continue

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);

        }


//        10. Stop printing when number reaches 7 using break

        for (int i = 1; i <= 10; i++) {
            if (i == 8) {
                break;
            }
            System.out.println(i);

        }

//        11. Print this pattern using nested loops


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }


    }


}
