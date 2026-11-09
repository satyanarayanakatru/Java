public class Arrays {

    public static void main(String[] args) {
//        1. Create an integer array with 5 numbers and print all elements.

        int[] array;

        array = new int[]{10, 20, 33, 40, 50, 60};

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);

//        2. Print all array elements using a for loop.
        for (int i = 0; i < array.length; i++) {
            System.out.println("For Loop array :" + array[i]);
        }

//        3. Print all array elements using an enhanced for loop.

        for (int numbers : array) {
            System.out.println("For Each Loop array :" + numbers);

        }

//        4. Calculate the sum of all array elements.


        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Sum of array: " + sum);

//        5. Calculate the average of array elements.


        double average = (double) sum / array.length;

        System.out.println("Average of array is : " + average);


//        6. Find the largest element in an array.

        int largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        System.out.println("largest is: " + largest);


//        7. Find the smallest element in an array.

        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < largest) {
                largest = array[i];
            }
        }

        System.out.println("smallest is: " + smallest);


//        8. Count how many even and odd numbers are present.

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount += 1;
                System.out.println("Even numbers is: " + array[i]);
            } else {
                oddCount += 1;
                System.out.println("Odd numbers is: " + array[i]);

            }
        }

        System.out.println("Even count is: " + evenCount);
        System.out.println("Odd count is: " + oddCount);


//        9. Search for a given number in an array.

        int num = 20;

        boolean isFound = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                isFound= true;
                System.out.println("Given number is : " + array[i] + " and index at : " + i);
            }
        }

        if (!isFound){
            System.out.println("Number is not there in array");

        }


//        10. Print the array elements in reverse order.


        for (int i = array.length - 1; i >= 0 ; i--){
            System.out.println("Reverse order is : " + array[i]);
        }

    }


}
