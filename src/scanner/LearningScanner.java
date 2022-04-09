package scanner;



import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args) {


        //Task 1
        Scanner input = new Scanner(System.in);
        System.out.println("What is your account balance?");
        double accountBalance = input.nextDouble();
        System.out.println("Your account balance is: " + accountBalance);

    }
}
