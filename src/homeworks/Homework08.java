package homeworks;

import java.util.Scanner;

public class Homework08 {

    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1: ");
        double rand1 = Math.random() * 51;

        if (rand1 >= 10 && rand1 <= 25) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        //Task 2
        System.out.println("\nTask 2: ");

        double rand2 = (Math.random() * 101) + 1;

        if (rand2 >= 1 && rand2 <= 50) {
            System.out.println((int) rand2 + " is in the 1st half");
            if (rand2 >= 1 && rand2 <= 25) {
                System.out.println((int) rand2 + " is in the 1st quarter");
            } else if (rand2 >= 26 && rand2 <= 50) {
                System.out.println((int) rand2 + " is in the 2nd quarter");
            }
        } else {
            System.out.println((int) rand2 + " is in the 2nd half");
            if (rand2 >= 51 && rand2 <= 75) {
                System.out.println((int) rand2 + " is in the 3rd quarter");
            } else if (rand2 >= 76 && rand2 <= 100) {
                System.out.println((int) rand2 + " is in the 4th quarter");
            }
        }


        //Task 3:
        System.out.println("\nTask 3: ");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 numbers between 1 and 10: ");

        int num1 = input.nextInt(), num2 = input.nextInt(),
                num3 = input.nextInt(), num4 = input.nextInt(), num5 = input.nextInt();

        int points = 0;

        if (num1 >= 1 && num1 <= 10) {
            num1 = num1 * 5;
        }else {
            num1 = num1 * 0;
        }if (num2 >= 1 && num2 <= 10){
            num2 = num2 *4;
        }else {
            num2 = num2 * 0;
        }if (num3 >= 1 && num3 <= 10){
            num3 = num3 *3;
        }else {
            num3 = num3 * 0;
        }if (num4 >= 1 && num4 <= 10){
            num4 = num4 *2;
        }else {
            num4 = num4 * 0;
        }if (num5 >= 1 && num5 <= 10) {
            num5 = num5 * 1;
        }else {
            num5 = num5 * 0;
        }

        points = num1 + num2 + num3 + num4 + num5;
        System.out.println(points);

    }
}