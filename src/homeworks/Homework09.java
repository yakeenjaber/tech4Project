package homeworks;

import utilities.ScannerHelper;

import java.util.Locale;

public class Homework09 {
    public static void main(String[] args) {

        //Task 1
        String name = ScannerHelper.getANameFromUser();

        System.out.println("Task 1: ");
        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last character in the name is = " + name.charAt(name.length()-1));
        System.out.println("The first 3 characters in the name are " + name.substring(0,3));
        System.out.println("The last 3 characters in the name are = " + name.substring(name.length()-3));

        String firstChar = String.valueOf(name.charAt(0));

        if(firstChar.equalsIgnoreCase("a")) {
            System.out.println("You are in the club");
        }else{
            System.out.println("Sorry, you are not in the club");
        }


        //Task 2
        System.out.println("\nTask 2:");

        String address = ScannerHelper.getAnAddressFromUser();

        if(address.toLowerCase().contains("Chicago")) System.out.println("You are in the club");
        else if(address.contains("Des Plaines")) System.out.println("You are welcome to join to the club");
        else System.out.println("Sorry, you wil never be in the club");


        //Task 3:
        System.out.println("\nTask 3: ");
        System.out.println("Please enter a minimum of 4 colors: ");

        String color = ScannerHelper.getAColorFromUser().trim().toLowerCase();

        if (color.contains("red") && color.contains("green")) System.out.println("Green and red are in the list");
        else if(color.contains("red")) System.out.println("Red is in the list");
        else if(color.contains("green")) System.out.println("Green is in the list");
        else System.out.println("Green and red are not in the list");


        //Task 4:
        System.out.println("\nTask 4: ");

        String str = "  Java is FUN  ";

        System.out.println("The first word in the str is = " + str.trim().toLowerCase().substring(0,4));
        System.out.println("The second word in the str is = " + str.trim().toLowerCase().substring(5,7));
        System.out.println("The third word in the str is = " + str.trim().toLowerCase().substring(8));

    }
}