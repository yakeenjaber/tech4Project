package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

        //Task 1:
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int sumNumber = number1 + number2;

        System.out.println("The number 1 entered by user is = " + number1);
        System.out.println("The number 2 entered by user is = " + number2);
        System.out.println("The sum of number 1 and 2 entered by user is = " + sumNumber);

        //Task 2:
        System.out.println("Enter 2 numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double divNumber = num1 / num2;

        System.out.println("The number 1 entered by user is = " + num1);
        System.out.println("The number 2 entered by user is = " + num2);
        System.out.println("The division of number 1 and 2 entered by user is = " + divNumber);
        System.out.println("\n\n");

        //Task 3:

        int prob1 = -10 + 7 * 5;
        System.out.println(prob1);
        int prob2 = (72+24) % 24;
        System.out.println(prob2);
        int prob3 = 10 + -3*9 / 9;
        System.out.println(prob3);
        int prob4 = 5 + 18 / 3 * 3 - (6 % 3);
        System.out.println(prob4);

        //Task 4:
        System.out.println("Enter 2 numbers: ");
        double float1 = input.nextInt();
        double float2 = input.nextInt();
        //System.out.println("number1 = " + float1);
        //System.out.println("number2 = " + float2);

        double sumofNumber = float1 + float2;
        double prdNumber = float1 * float2;
        double subNumber = float1 - float2;
        double divofNumber = float1 / float2;
        double modNumber = float1 % float2;

        System.out.println("The sum of the given numbers is = " + sumofNumber);
        System.out.println("The product of the given numbers is = " + prdNumber);
        System.out.println("The subtraction of the given numbers is = " + subNumber);
        System.out.println("The division of the given numbers is = " + divofNumber);
        System.out.println("The remainder of the given numbers is = " + modNumber);
        System.out.println("\n\n");
        //Task 5:

        double widthRect = 7.5;
        double heightrRect = 10.5;
        double areaRect = widthRect * heightrRect;
        double perimRect = 2 * (widthRect + heightrRect);

        System.out.println("The area of the rectangle = " + areaRect);
        System.out.println("The perimeter of the rectangle = " + perimRect);
        System.out.println("\n\n");

        //Task 6:

        double avgSalary = 90000;
        double yrsWorking = 3;
        double threeYrSal = avgSalary * yrsWorking;

        System.out.println("A Software Engineer in Test can earn " + threeYrSal + " in \n3 years.");
        }

    }

