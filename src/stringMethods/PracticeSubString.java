package stringMethods;

import java.util.Scanner;

public class PracticeSubString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = input.nextLine();


        String firstWord = s.substring(0,s.indexOf(" "));
        String lastWord = s.substring(s.lastIndexOf(' ') + 1);
        System.out.println("The first word is = " + firstWord);
        System.out.println("The last word is = " + lastWord);

    }
}
