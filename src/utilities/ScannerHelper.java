package utilities;

import java.util.Scanner;

public class ScannerHelper {

    public static int getNumberFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public static String getANameFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = input.nextLine();
        return name;
    }
    public static String getAsentenceFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String input = scanner.nextLine();
        return input;
    }
    public static String getAStringFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String string = input.nextLine();
        return string;
    }
    public static String getAnAddressFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full address: ");
        String string = input.nextLine();
        return string;
        }

    public static String getAColorFromUser(){
        Scanner input = new Scanner(System.in);
        //System.out.println("Please enter a color: ");
        String string = input.nextLine();
        return string;
    }

    public static String getACountryFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a country name: ");
        String string = input.nextLine();
        return string;
    }

    public static String getANameFromUserHW11() {
        Scanner input = new Scanner(System.in);
        //System.out.println("Please enter a name: ");
        String name = input.nextLine();
        return name;
    }
}
