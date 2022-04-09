package homeworks;

import utilities.ScannerHelper;
import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {

        //Task 1:
        System.out.println("Task 1: ");

        String s = "";
        for (int i = 1; i <= 100; i++){
            if (i % 7 == 0 ){
                s += i + " - ";
            }
        }
        if (!s.isEmpty()) System.out.println(s.substring(0,s.length()-3));
        else System.out.println(s);

        //Task 2:
        System.out.println("\nTask 2: ");

        String s1 = "";
        for(int i = 1; i<=50; i++){
            if (i % 6 == 0){
                s1 += i + " - ";
            }
        }
        if (!s1.isEmpty()) System.out.println(s1.substring(0,s1.length()-3));
        else System.out.println(s1);

        //Task 3:
        System.out.println("\nTask 3: ");

        String s2 = "";
        for(int i = 100; i>=50; i--){
            if (i % 5 == 0){
                s2 += i + " - ";
            }
        }
        if (!s2.isEmpty()) System.out.println(s2.substring(0,s2.length()-3));
        else System.out.println(s2);

        //Task 4:
        System.out.println("\nTask 4: ");

        for (int i = 0; i <=7; i++){
            System.out.println("The square of " + i + " is = " + i*i);
        }

        //Task 5:
        System.out.println("\nTask 5: ");

        int add = 0;
        for (int i = 0; i<=10; i++){
            add += i;
        }
        System.out.println(add);

        //Task 6:
        System.out.println("\nTask 6: ");

        int num1 = ScannerHelper.getNumberFromUser();
        int factorial = 1;

        for (int i = 1; i <= num1; i++){
            factorial *= i ;
        }
        System.out.println(factorial);

        //Task 7:
        System.out.println("\nTask 7:");
        String fullName = ScannerHelper.getANameFromUser();

        int count = 0;

       for (int i = 0; i <fullName.length(); i++){
           if (fullName.toLowerCase().charAt(i) == 'a' || fullName.toLowerCase().charAt(i) == 'e' || fullName.toLowerCase().charAt(i) == 'i'
                || fullName.toLowerCase().charAt(i) == 'o' || fullName.toLowerCase().charAt(i) == 'u'){
               count++;
            }
       }
        System.out.println("There are " + count + " vowel letters in this full name");

        //Task 8:
        System.out.println("\nTask 8: ");

        Scanner scanner = new Scanner(System.in);

        int input = 0;
        int sum = 0;

        do {
            System.out.print("Enter number: ");
            input = scanner.nextInt();
            if (input > 100) {
                System.out.println("This number is already more than 100");
                break;
            }
            else if (sum + input <= 100)
                sum += input;
            else sum+= input;

        } while (sum < 100);

        System.out.println("Sum of entered numbers is at least 100.");


        //Task 9:
        System.out.println("\nTask 9:");


        int number1 = 0, number2 = 1;
        int counter = 0;
        int userN = ScannerHelper.getNumberFromUser();

        String s9 = "";

        while (counter < userN) {
            s9 += number1 + " - ";
            int number3 = number2 + number1;
            number1 = number2;
            number2 = number3;
            counter = counter + 1;
        }

        System.out.println(s9.substring(0, s9.length()-3));

        //Task 10:
        System.out.println("\nTask 10:");
        int count10 = 0;
        String name = ScannerHelper.getANameFromUser();
        while (!name.toLowerCase().startsWith("j")){
            name = scanner.nextLine();
            System.out.println("Please enter a name");
            //name = scanner.nextLine();
            count10 += count10;
        }
        if (name.toLowerCase().startsWith("j")) System.out.println("End of program");
    }
    }
