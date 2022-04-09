package homeworks;

import java.util.Scanner;

public class Homework04 {

    public static void main(String[] args) {

        //Task 1
        Scanner input = new Scanner(System.in);
        System.out.println("Task 1:");
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();
        System.out.println("Enter another number: ");
        int num2 = input.nextInt();
        int avg = (num1 + num2) / 2;

        System.out.println("The average of the given 2 numbers is: " + avg);

        //Task 2
        System.out.println("\nTask 2:");
        System.out.println("Enter a number: ");
        int numb1 = input.nextInt();
        System.out.println("Enter another number: ");
        int numb2 = input.nextInt();
        int prd = (numb1 * numb2);

        System.out.println("The product of the given 2 numbers is: " + prd);

        //Task 3
        System.out.println("\nTask 3:");
        System.out.println("Enter three numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        int square1 = number1 * number1;
        int square2 = number2 * number2;
        int square3 = number3 * number3;

        System.out.println("The " + number1 + " mulitplied with " + number1 + " is = " + square1);
        System.out.println("The " + number2 + " multiplied with " + number2 + " is = " + square2);
        System.out.println("The " + number3 + " multiplied with " + number3 + " is = " + square3);


        System.out.println("\nTask 4:");
        System.out.println("Enter two numbers: ");

        int modnum1 = input.nextInt();
        int modnum2 = input.nextInt();
        int modulus = (modnum1 % modnum2);

        System.out.println("The remainder of " + modnum1 + " % " + modnum2 + " = " + modulus);

        //Task 5
        System.out.println("\nTask 5");
        System.out.println("Enter five numbers: ");

        int avgnum1 = input.nextInt();
        int avgnum2 = input.nextInt();
        int avgmum3 = input.nextInt();
        int avgnum4 = input.nextInt();
        int avgnum5 = input.nextInt();

        int avg5 = (avgnum1 + avgnum2 + avgmum3 + avgnum4 + avgnum5) / 5;

        System.out.println("The average of the given 5 numbers is: " + avg5);

        //Task 6
        System.out.println("\nTask 6:");
        System.out.println("Enter one number: ");

        int onenum = input.nextInt();

        int times1 = onenum * 1;
        int times2 = onenum * 2;
        int times3 = onenum * 3;
        int times4 = onenum * 4;
        int times5 = onenum * 5;
        int times6 = onenum * 6;
        int times7 = onenum * 7;
        int times8 = onenum * 8;
        int times9 = onenum * 9;
        int times10 = onenum * 10;

        System.out.println(onenum + " * 1 = " + times1);
        System.out.println(onenum + " * 2 = " + times2);
        System.out.println(onenum + " * 3 = " + times3);
        System.out.println(onenum + " * 4 = " + times4);
        System.out.println(onenum + " * 5 = " + times5);
        System.out.println(onenum + " * 6 = " + times6);
        System.out.println(onenum + " * 7 = " + times7);
        System.out.println(onenum + " * 8 = " + times8);
        System.out.println(onenum + " * 9 = " + times9);
        System.out.println(onenum + " * 10 = " + times10);

        System.out.println("\nTask 7:");
        System.out.println("Enter the length of the side: ");

        int side = input.nextInt();
        int perim = 4 * side;
        int area = side * side;

        System.out.println("Perimeter of the square = " + perim);
        System.out.println("Area of the square = " + area);
    }
}
