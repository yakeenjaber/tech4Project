package homeworks;

import java.util.Scanner;

public class Homework07 {

    public static void main(String[] args) {

        //Task 1
        double num1 = Math.random() * 11;
        double num2 = Math.random() * 11;
        double num3 = Math.random() * 11;
        double num4 = Math.random() * 11;

        System.out.println("Task 1: ");
        System.out.println("Number 1 = " + (int)num1);
        System.out.println("Number 2 = " + (int)num2);
        System.out.println("Number 3 = " + (int)num3);
        System.out.println("Number 4 = " + (int)num4);

        int diffNum1 = (int)num1;
        int diffNum2 = (int)num2;
        int diffNum3 = (int)num3;
        int diffNum4 = (int)num4;

        int absDiffNum1 = Math.abs(diffNum1 - 5);
        int absDiffNum2 = Math.abs(diffNum2 - 5);
        int absDiffNum3 = Math.abs(diffNum3 - 5);
        int absDiffNum4 = Math.abs(diffNum4 - 5);

        System.out.println("Absolute difference of " + diffNum1 + " with 5 is = " + absDiffNum1);
        System.out.println("Absolute difference of " + diffNum2 + " with 5 is = " + absDiffNum2);
        System.out.println("Absolute difference of " + diffNum3 + " with 5 is = " + absDiffNum3);
        System.out.println("Absolute difference of " + diffNum4 + " with 5 is = " + absDiffNum4);

        int max = Math.max(diffNum1, Math.max(diffNum2, Math.max(diffNum3, diffNum4)));
        int min = Math.min(diffNum1, Math.min(diffNum2, Math.min(diffNum3, diffNum4)));


        System.out.println("Greatest number is = " + max);
        System.out.println("Smallest number is = " + min);


        //Task 2
        System.out.println("\nTask 2: ");

        double rand1 = (Math.random() * 101) - 50;
        double rand2 = (Math.random() * 101) - 50;
        double rand3 = (Math.random() * 101) - 50;
        double rand4 = (Math.random() * 101) - 50;
        double rand5 = (Math.random() * 101) - 50;
        double rand6 = (Math.random() * 101) - 50;
        double rand7 = (Math.random() * 101) - 50;
        double rand8 = (Math.random() * 101) - 50;

        System.out.println("Number 1 = " + (int)rand1);
        System.out.println("Number 2 = " + (int)rand2);
        System.out.println("Number 3 = " + (int)rand3);
        System.out.println("Number 4 = " + (int)rand4);
        System.out.println("Number 5 = " + (int)rand5);
        System.out.println("Number 6 = " + (int)rand6);
        System.out.println("Number 7 = " + (int)rand7);
        System.out.println("Number 8 = " + (int)rand8);

        int max1 = (int) Math.max(rand1, Math.max(rand2, Math.max(rand3, Math.max(rand4, Math.max(rand5, Math.max(rand6, Math.max(rand7, rand8)))))));
        int min1 = (int) Math.min(rand1, Math.min(rand2, Math.min(rand3, Math.min(rand4, Math.min(rand5, Math.min(rand6, Math.min(rand7, rand8)))))));

        System.out.println("Greatest number is = " + max1);
        System.out.println("Smallest number is = " + min1);

        int avg = (int) ((rand1 + rand2 + rand3 + rand4 + rand5 + rand6 + rand7 + rand8) / 8);
        System.out.println("Average of 8 numbers is = " + avg);

        int absDiffMinMax = Math.abs(min1 - max1);
        System.out.println("Absolute difference between smallest and greatest is = " + absDiffMinMax);

        if (rand3 > 0) {
            System.out.println("3rd number is positive = true");
        }
        else {
            System.out.println("3rd number is positive = false");
            }
        if (rand5 < 0) {
            System.out.println("5th number is negative = true");
        }
        else {
            System.out.println("5th number is negative = false");
        }


        if (rand1 == 0 || rand2 == 0 || rand3 == 0 || rand4 == 0 || rand5 == 0 || rand6 == 0 || rand7 == 0 || rand8 == 0) {
            System.out.println("There is at least one zero among those numbers is = true");
        }
        else {
            System.out.println("There is at least one zero among those numbers is = false");
        }

        //Task 3
        System.out.println("\nTask 3:");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 7 Numbers between 0 and 50: ");
        int in1 = input.nextInt();
        int in2 = input.nextInt();
        int in3 = input.nextInt();
        int in4 = input.nextInt();
        int in5 = input.nextInt();
        int in6 = input.nextInt();
        int in7 = input.nextInt();

        System.out.println("Number 1 = " + in1);
        System.out.println("Number 2 = " + in2);
        System.out.println("Number 3 = " + in3);
        System.out.println("Number 4 = " + in4);
        System.out.println("Number 5 = " + in5);
        System.out.println("Number 6 = " + in6);
        System.out.println("Number 7 = " + in7);

        int max2 = Math.max(in1, Math.max(in2, Math.max(in3, Math.max(in4, Math.max(in5, Math.max(in6, in7))))));
        int min2 = Math.min(in1, Math.min(in2, Math.min(in3, Math.min(in4, Math.min(in5, Math.min(in6, in7))))));

        System.out.println("Greatest number is = " + max2);
        System.out.println("Smallest number is = " + min2);

        int avg1 = ((in1 + in2 + in3 + in4 + in5 + in6 + in7 ) / 7);
        System.out.println("Average of 7 numbers is = " + avg1);

        if(in1 >= 10) {
            System.out.println("First number is greater than or equal to 10 = true");
        }
        else {
            System.out.println("First number is greater than or equal to 10 = false");
        }
        if(in7 <= 40) {
            System.out.println("Last number is less than or equal to 40 = true");
        }
        else{
            System.out.println("Last number is less than or equal to 40 = false");
            }
        if(in1 > 25 && in7 >25) {
            System.out.println("Both first and last numbers are greater than 25 = true");
        }
        else {
            System.out.println("Both first and last numbers are greater than 25 = false");
            }

        if (in1 == 0 || in2 == 0 || in3 == 0 || in4 == 0 || in5 == 0 || in6 == 0 || in7 == 0 || in1 == 50 || in2 == 50
                || in3 == 50 || in4 == 50 || in5 == 50 || in6 == 50 || in7 == 50) {
            System.out.println("At least one of those numbers is 0 or 50  = true");
        }
        else{
            System.out.println("At least one of those numbers is 0 or 50  = false");

        }
        if(in1 >= 40 && in1 <= 50 && in2 >= 40 && in2 <= 50 && in3 >= 40 && in3 <= 50
                && in4 >= 40 && in4 <= 50 && in5 >= 40 && in5 <= 50 && in6 >= 40 && in6 <= 50 && in7 >= 40 && in7 <= 50 ) {
            System.out.println("There is no number between 40 and 50 = true");
        }
        else{
            System.out.println("There is no number between 40 and 50 = false");
        }

        //Task 4
        System.out.println("\nTask 4: ");

        double random1 = (Math.random() * 101);
        double random2 = (Math.random() * 101);
        double random3 = (Math.random() * 101);

        System.out.println((int)(random1));
        System.out.println((int)(random2));
        System.out.println((int)(random3));

        if(random1 > 25 && random2 > 25 && random3 > 25) {
            System.out.println("true");
        }
            else{
            System.out.println("false");
        }


        //Task 5
        System.out.println("\nTask 5");

        System.out.println("Enter a Number from 1 to 7: ");
        int inp1 = input.nextInt();

        switch (inp1){
            case 1:
                System.out.println("The number entered returns MONDAY");
                break;
            case 2:
                System.out.println("The number entered returns TUESDAY");
                break;
            case 3:
                System.out.println("The number entered returns WEDNESDAY");
                break;
            case 4:
                System.out.println("The number entered returns THURSDAY");
                break;
            case 5:
                System.out.println("The number entered returns FRIDAY");
                break;
            case 6:
                System.out.println("The number entered returns SATURDAY");
                break;
            case 7:
                System.out.println("The number entered returns SUNDAY");
                break;
        }

        //Task 6
        System.out.println("\nTask 6: ");

        System.out.println("Enter a number from -10 to 10: ");

        int input1 = input.nextInt();
        System.out.println(input1);

        if(input1 > 0) {
            System.out.println("Number entered is POSITIVE");
        }
        else if(input1 < 0) {
            System.out.println("Number entered is NEGATIVE");
        }
        else if(input1 == 0) {
            System.out.println("Number entered is ZERO");
        }

        if(input1 % 2 == 0) {
            System.out.println("Number entered is EVEN");
        }
        else if (input1 % 2 == 1) {
            System.out.println("Number entered is ODD");
        }

        //Task 7
        System.out.println("\nTask 7");

        System.out.println("Tell me your exam results: ");
        int exam1 = input.nextInt();
        int exam2 = input.nextInt();
        int exam3 = input.nextInt();

        int avgExam = (exam1 + exam2 + exam3) / 3;

        if(avgExam < 70) {
            System.out.println("YOU FAILED");
        }
        else {
            System.out.println("YOU PASSED");
        }

        //Task 8
        System.out.println("\nTask 8: ");

        System.out.println("Enter 3 numbers: ");
        int enter1 = input.nextInt();
        int enter2 = input.nextInt();
        int enter3 = input.nextInt();

        if (enter1 == enter2 && enter2 == enter3) {
            System.out.println("TRIPLE MATCH");
        }
        else if(enter1 == enter2 || enter1 == enter3 || enter2 == enter3) {
            System.out.println("DOUBLE MATCH");
        }
        else {
            System.out.println("NO MATCH");
        }
    }
    }



