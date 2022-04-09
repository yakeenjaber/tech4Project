package projects;

import utilities.ScannerHelper;

public class Project06 {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1: ");
        String str = ScannerHelper.getAStringFromUser();

        int count = 1;

        if (!str.trim().contains(" ")) System.out.println("This sentence does not have multiple words");
        else {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isSpaceChar(str.charAt(i)))
                    count++;
            }
            System.out.println("This sentence has " + count + " words");
        }

        //Task 2:
        System.out.println("Task 2: ");

        String regular = ScannerHelper.getAStringFromUser();
        String reversed = "";

        if (regular.length() < 1) System.out.println("This word does not have 1 or more characters.");
        else {
            for (int i = regular.length() - 1; i >= 0; i--) {
                reversed = reversed + regular.charAt(i);
            }
            if (!regular.equals(reversed)) System.out.println("This word is not palindrome");
            else System.out.println("This word is palindrome");
        }

        //Task 3:
        System.out.println("\nTask 3: ");

        String str3 = ScannerHelper.getAsentenceFromUser();
        if (str3.length() < 1) System.out.println("This word does not have 1 or more characters.");

        else {
            int aOrA = 0;

            for (int i = 0; i < str3.length(); i++) {
                if (str3.charAt(i) == 'a') {
                    aOrA++;
                }if (str3.charAt(i) == 'A') {
                    aOrA++;
                }
            } System.out.println("This sentence has " + aOrA + " a or A letters");
        }


        //Task 4:
        System.out.println("\nTask 4: ");

        int num = ScannerHelper.getNumberFromUser();
        for(int i = 1;i<=num; i++){
            if (i % 2 == 0 && i % 3 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 3 == 0) System.out.println("Bar");
            else System.out.println(i);
            }
        }
    }