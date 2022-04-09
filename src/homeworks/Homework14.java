package homeworks;

import java.util.ArrayList;
import java.util.List;

public class Homework14 {
    public static void main(String[] args) {

        //Task 1:
        System.out.println("Task 1:");
        boolean boolDuplicateInt = false;
        int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};
        List<Integer> duplicateInt = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (!duplicateInt.contains(numbers[i]) && numbers[i] == numbers[j]) {
                    duplicateInt.add(numbers[i]);
                    boolDuplicateInt = true;
                }
            }
        }
        if(boolDuplicateInt) System.out.println(duplicateInt.get(0));
        else System.out.println("There is no duplicates");


        //Task 2
        System.out.println("\nTask 2:");
        boolean boolDuplicateString = false;
        String[] words = {"Z", "abc","z", "123", "#" };

        List<String> duplicateString = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (!duplicateString.contains(words[i]) && words[i].equalsIgnoreCase(words[j])) {
                    duplicateString.add(words[i]);
                    boolDuplicateString = true;
                }
            }
        }
        if(boolDuplicateString) System.out.println(duplicateString.get(0));
        else System.out.println("There is no duplicates");


        //Task 3:
        System.out.println("\nTask 3:");
        boolean boolDuplicateInt3 = false;
        int[] numbers3 = {0, -4, -7, 0, 5, 10, 45, -7 ,0};
        //int[] numbers3 = {1,2,5,0,7};

        List<Integer> duplicateInt3 = new ArrayList<>();
        for (int i = 0; i < numbers3.length; i++) {
            for (int j = i + 1; j < numbers3.length; j++) {
                if (!duplicateInt3.contains(numbers3[i]) && numbers3[i] == numbers3[j]) {
                    duplicateInt3.add(numbers3[i]);
                    System.out.println(numbers3[i]);
                    boolDuplicateInt3 = true;
                }
            }
        }
        for (int i = 0; i < duplicateInt3.size(); i++) {
            if (!boolDuplicateInt3) System.out.println("There is no duplicates");
            }


        //Task 4:
        System.out.println("\nTask 4:");
        boolean boolDuplicateString4 = false;
        String[] words4 = {"A", "foo","12", "Foo", "bar", "a", "a", "java"};

        List<String> duplicateString4 = new ArrayList<>();
        for (int i = 0; i < words4.length; i++) {
            for (int j = i + 1; j < words4.length; j++) {
                if (!duplicateString4.contains(words4[i]) && words4[i].equalsIgnoreCase(words4[j])) {
                    duplicateString4.add(words4[i]);
                    boolDuplicateString4 = true;
                }
            }
        }
        if(boolDuplicateString4) {
            System.out.println(words4[0]);
            System.out.println(words4[1]);
        }else System.out.println("There is no duplicates");


        //Task 5:
        System.out.println("\nTask 5: ");
        String[] words1 = {"abc", "foo", "bar"};
        List<String> reversedWords1 = new ArrayList<>();

        for (int i = words1.length-1; i >= 0 ; i--) {
            reversedWords1.add(words1[i]);
        }
        System.out.println(reversedWords1);


        //Task 6:
        System.out.println("\nTask 6: ");
        String str = "Java is fun";
        String reversedStr = "";

        String[] string = str.split(" ");
        for (String str2 : string) {
            for (int i = str2.length()-1; i >= 0; i--) {
                reversedStr = reversedStr + str2.charAt(i);
            }
            reversedStr += " ";
        }
        System.out.println(reversedStr);
        }

    }

