package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        //Yakeen Jaber
        //Task 1
        Scanner input = new Scanner(System.in);
        Scanner adressScanner = new Scanner(System.in);
        Scanner phoneNumberscan = new Scanner(System.in);

        System.out.println("Enter Your First Name: ");
        String firstName = input.next();
        System.out.println("Enter Your Last Name: ");
        String lastName = input.next();

        System.out.println("Enter Your Age: ");
        int age = input.nextInt();

        System.out.println("Enter Your Email Address: ");
        String emailAddress = input.next();


        System.out.println("Enter Your Phone Number: ");
        String phoneNumber = phoneNumberscan.nextLine();


        System.out.println("Enter Your Address: ");
        String address = adressScanner.nextLine();

        //Output Statements
        System.out.print("User who joined this program is " + firstName + " " + lastName + ". ");
        System.out.print("User's age is: " + age + ". ");
        System.out.print("User's email address is: " + emailAddress + ", ");
        System.out.print("phone number " + phoneNumber + ", ");
        System.out.print("and address is: " + address + ".");
        System.out.println("\n");

        //Task 2
        Scanner task2Input = new Scanner(System.in);
        System.out.println("Enter Your Favorite Book: ");
        String favBook = task2Input.nextLine();

        Scanner task2Input2 = new Scanner(System.in);
        System.out.println("Enter Your Favorite Color: ");
        String favColor = task2Input2.next();
        System.out.println("Enter Your Favorite Number: ");
        int favNumber = task2Input2.nextInt();

        System.out.print("User's favorite book is: " + favBook + "\n" + "User's favorite color is: "
                + favColor + "\n" + "User's favorite number is: " + favNumber);
    }
}
