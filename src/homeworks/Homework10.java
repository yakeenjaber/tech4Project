package homeworks;

import utilities.ScannerHelper;
import utilities.StringHelper;

public class Homework10 {
    public static void main(String[] args) {

        //Task 1:
        System.out.println("Task 1: ");
        String str1 = ScannerHelper.getAStringFromUser();

        if (str1.isEmpty()) System.out.println("Length is Zero");
        else {
            System.out.println("Length is = " + str1.length());
            System.out.println("First char is = " + str1.charAt(0));
            System.out.println("Last char is = " + str1.substring(str1.length() - 1));
        }
        if (str1.toLowerCase().contains("a") || str1.toLowerCase().contains("e") || str1.toLowerCase().contains("i") ||
                str1.toLowerCase().contains("o") || str1.toLowerCase().contains("u"))
            System.out.println("This string has vowel");
        else System.out.println("This string does not have vowel.");

        //Task 2:
        System.out.println("\nTask 2: ");
        String str2 = ScannerHelper.getAStringFromUser();

        if (str2.length() < 3) System.out.println("Length is less than 3");
        else System.out.println(StringHelper.getMiddle(str2));

        //Task 3:
        System.out.println("\nTask 3: ");
        String str3 = ScannerHelper.getAStringFromUser();

        if (str3.length() < 4) System.out.println("Invalid Input");
        else {
            String firstTwo = str3.substring(0, 2);
            String lastTwo = str3.substring(str3.length() - 2);
            String middle = str3.substring(2, str3.length() - 2);
            System.out.println("First 2 characters are = " + firstTwo);
            System.out.println("Last 2 characters are = " + lastTwo);
            System.out.println("The other characters are = " + middle);
        }

        //Task 4:
        System.out.println("\nTask 4: ");
        String str4 = ScannerHelper.getAStringFromUser();

        if (str4.length() < 2) System.out.println("Length is less than 2");
        else if (str4.substring(0, 2).equals(str4.substring(str4.length() - 2))) System.out.println("true");
        else System.out.println("false");

        //Task 5
        System.out.println("\nTask 5: ");
        String str5 = ScannerHelper.getAStringFromUser();
        String str5_1 = ScannerHelper.getAStringFromUser();

        if (str5.length() < 2 || str5_1.length() < 2) System.out.println("Invalid input!");
        else{
            System.out.println(str5.substring(1,str5.length()-1).concat(str5_1.substring(1,str5_1.length()-1)));
        }

        //Task 6:
        System.out.println("\nTask 6:");
        String str6 = ScannerHelper.getAStringFromUser();

        if (str6.length() < 4) System.out.println("INVALID INPUT");
        else if (str6.startsWith("xx") && str6.endsWith("xx")) System.out.println("true");
        else System.out.println("false");
    }

    }


