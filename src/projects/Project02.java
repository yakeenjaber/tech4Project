package projects;

import java.util.Scanner;

public class Project02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Task 1
        System.out.println("Task 1:");
        System.out.println("Please enter 3 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int prd = (num1 * num2 * num3);

        System.out.println("The product of the numbers entered is: " + prd);

        //Task 2
        System.out.println("\nTask 2:");
        System.out.println("What is your first name?");
        String firstName = input.next();
        System.out.println("What is your last name?");
        String lastName = input.next();
        System.out.println("What is your year of birth?");
        int year = input.nextInt();
        int currYear = 2022;
        int age = currYear - year;
        System.out.println((firstName + " " + lastName + "'s age is = " + age + "."));


        //Task 3
        System.out.println("\nTask 3: ");
        System.out.println("What is your full name?");
        input.nextLine();
        String fullName = input.nextLine();
        System.out.println("What is your weight?");
        double weight = input.nextInt();
        double weightInLbs = 2.205 * weight;

        System.out.println(fullName + "'s weight is = " + weightInLbs + " lbs.");


        //Task 4
        System.out.println("\nTask 4: ");
        System.out.println("What is your full name?");
        input.nextLine();
        String fullName1 = input.nextLine();
        System.out.println("What is your age?");
        int age1 = input.nextInt();
        System.out.println("What is your full name?");
        input.nextLine();
        String fullName2 = input.nextLine();
        System.out.println("What is your age?");
        int age2 = input.nextInt();
        System.out.println("What is your full name?");
        input.nextLine();
        String fullName3 = input.nextLine();
        System.out.println("What is your age?");
        int age3 = input.nextInt();

        int avgAge = ((age1 + age2 + age3) / 3);
        int eldestAge = Math.max(age1, Math.max(age2, age3));
        int youngestAge = Math.min(age1, Math.min(age2, age3));;

        System.out.println(fullName1 + "'s age is " + age1 + ".");
        System.out.println(fullName2 + "'s age is " + age2 + ".");
        System.out.println(fullName3 + "'s age is " + age3 + ".");
        System.out.println("The average age is " + avgAge + ".");
        System.out.println("The eldest age is " + eldestAge + ".");
        System.out.println("The youngest age is " + youngestAge + ".");
    }
}