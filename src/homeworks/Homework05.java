package homeworks;

import java.util.Scanner;

public class Homework05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Task 1
        System.out.println("Task 1: ");
        System.out.println("Enter 3 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int maxValueOfTwoNum = Math.max(num1, num2);
        int maxValueOfAllThree = Math.max(maxValueOfTwoNum, num3);
        int minValueOfTwoNum = Math.min(num1, num2);
        int minValueOfAllThree = Math.min(minValueOfTwoNum, num3);

        System.out.println("Max Value = " + maxValueOfAllThree);
        System.out.println("Min Value = " + minValueOfAllThree);

        System.out.println("\nTask 2: ");
        System.out.println("Enter five numbers:");
        int numb1 = input.nextInt();
        int numb2 = input.nextInt();
        int numb3 = input.nextInt();
        int numb4 = input.nextInt();
        int numb5 = input.nextInt();

        int maxval = Math.max(numb1, Math.max(numb2, Math.max(numb3, Math.max(numb4, numb5))));
        int minval = Math.min(numb1, Math.min(numb2, Math.min(numb3, Math.min(numb4, numb5))));

        System.out.println("Max value = " + maxval);
        System.out.println("Min value = " + minval);

        //Task 3
        System.out.println("\nTask 3: ");
        System.out.println("Enter two numbers:");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int difference = (number1 - number2);

        System.out.println("The difference between numbers is = " + Math.abs(difference));

        //Task 4
        System.out.println("\nTask 4: ");



        int rand1 = (int) (Math.random() * 51) +50;
        int rand2 = (int) (Math.random() * 51) +50;
        int rand3 = (int) (Math.random() * 51) +50;
        int sumRand = (rand1 + rand2 + rand3);

        System.out.println("Number 1 = " + rand1);
        System.out.println("Number 2 = " + rand2);
        System.out.println("Number 3 = " + rand3);

        System.out.println("The sum of random numbers is = " + sumRand);


        //Task 5
        System.out.println("\nTask 5:");
        double alexStart = 125;
        double mikeStart = 220;

        double alexGive = alexStart - 25.5;
        double mikeReceive = mikeStart + 25.5;

        System.out.println("Alex's Money: $" + alexGive);
        System.out.println("Mike's Money: $" + mikeReceive);


        //Task 6
        System.out.println("\nTask 6:");
        double bike = 390;
        double perDay = 15.60;

        double numDays = bike/perDay;

        System.out.println((int)numDays);

        }
    }

