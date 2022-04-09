package homeworks;

import java.util.Scanner;

public class Homework06 {

    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1: ");
        String s1 = "5", s2 = "10";

        //String s1 & s2
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        int sum1 = (num1 + num2);
        int prd1 = (num1 * num2);
        int div1 = (num1 / num2);
        int sub1 = (num1 - num2);
        int rem1 = (num1 % num2);

        System.out.println("Sum of " + num1 + " and " + num2 + " is = " + sum1);
        System.out.println("Product of " + num1 + " and " + num2 + " is = " + prd1);
        System.out.println("Division of " + num1 + " and " + num2 + " is = " + div1);
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is = " + sub1);
        System.out.println("Remainder of " + num1 + " and " + num2 + " is = " + rem1);


        //Task 2
        System.out.println("\nTask 2:");

        String str1 = "200";
        String str2 = "-50";

        int number1 = Integer.parseInt(str1);
        int number2 = Integer.parseInt(str2);

        int max = Math.max(number1, number2);
        int min = Math.min(number1, number2);
        int avg = (number1 + number2) / 2;
        int absDiff = Math.abs((number1 - number2));

        System.out.println("The greatest value is = " + max);
        System.out.println("The smallest value is = " + min);
        System.out.println("The average of those is = " + avg);
        System.out.println("The absolute difference of them = " + absDiff);


        //Task 3
        System.out.println("\nTask 3:");

        double dailySaved = (.75 + .10 + .10 + .01);
        double savedTo24 = (24.00 / dailySaved);
        double savedTo168 = (168.00 / dailySaved);
        double savedIn150 = (dailySaved * 150);

        System.out.println((int)(savedTo24)+ " days");
        System.out.println((int)(savedTo168)+ " days");
        System.out.println("$" + savedIn150);


        //Task 4
        System.out.println("\nTask 4: ");

        double jesseSaving = 62.50;
        double newComputer = 1250;
        double daysNewComp = newComputer/jesseSaving;

        System.out.println((int)(daysNewComp));


        //Task 5
        System.out.println("\nTask 5: ");

        double payment1 = 475.50;
        double payment2 = 951;
        double newCar = 14265;

        double option1 = (newCar / payment1);
        double option2 = (newCar / payment2);

        System.out.println("Option 1 will take " + (int)option1 + " months");
        System.out.println("Option 2 will take " + (int)option2 + " months");

        //Task 6
        System.out.println("\nTask 6: ");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        int val1 = input.nextInt();
        int val2 = input.nextInt();
        double div = (double) val1 / val2;

        System.out.println(div);

    }
}

