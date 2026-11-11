package Problems;

public class Day4 {

    public static void main(String[] args){

//1. Largest of four

        int numbers [] = {20,30,110,150};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }

        System.out.println("Largest number is : " + largest);

        //    2. Voting eligibility

        int age = 13;
        int eligibleAge = 18;

        if(age > eligibleAge){
                System.out.println("age is eligible for voting");
        } else{
            System.out.println("your age is not eligibe for voting");
        }


//       3.  Grade calculator

        int marks = 90;

        if(marks < 0 || marks > 100){
            System.out.println("Invalid marks ");
        } else if (marks >= 90){
            System.out.println("Your grade is A");

        } else if (marks >= 75){

            System.out.println("Your grade is B");
        } else if (marks >= 60){
            System.out.println("Your grade is C");

        } else if (marks >= 35){
            System.out.println("Your grade is D");

        } else {
            System.out.println("You are fail");

        }

    }


}
