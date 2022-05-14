package homeworks;

import java.time.LocalDate;
import java.util.Arrays;

public class Homework18 {

    //Task 1:
    public static String noSpace(String str){
        str = str.trim();
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isWhitespace(sb.charAt(i))) sb.deleteCharAt(i);
        }
        return String.valueOf(sb);
    }

    //Task 2:
    public static String replaceFirstLast(String str){
        String s = "";
        str = str.trim();
        if (str.length() < 2) s = "";
        else {
            for (int i = 1; i < str.length()-1; i++) {
                s += str.charAt(i);
            }
            s = str.charAt(str.length()-1) + s + str.charAt(0);
        }
        return s;
    }

    //Task 3:
    public static boolean hasVowel(String str){
        boolean vowel = false;
        String letters = "AEIOUaeiou";
        for (char c : str.toCharArray()){
            if (letters.indexOf(c) >= 0) vowel = true;
            break;
        }
        return vowel;
    }
    //Task 4:
    public static void checkAge(int yearOfBirth){
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int age = currentYear - yearOfBirth;

        if(currentYear < yearOfBirth) System.out.println("AGE IS NOT VALID");
        else if (age < 16) System.out.println("AGE IS NOT ALLOWED");
        else if (age >= 16 && age < 100) System.out.println("AGE IS ALLOWED");
        else System.out.println("AGE IS NOT VALID");
    }

    //Task 5:
    public static int averageOfEdges(int a, int b, int c){
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int average = (max + min) / 2;

        return average;
    }

    //Task 6:
    public static String[] noA(String[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i].startsWith("a") || arr[i].startsWith("A")) arr[i] = "###";
        }
        return arr;
    }

    //Task 7:
    public static int[] no3or5(int[] arr){
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 15 == 0) arr[i] = 101;
            else if (arr[i] % 3 == 0) arr[i] = 100;
            else if (arr[i] % 5 == 0) arr[i] = 99;
        return arr;
    }

    //Task 8: NOT DONE
    /*
    public static int[] countPrimes(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i])
        }

     */



    public static void main(String[] args) {
        System.out.println("Task 1:");
        System.out.println(noSpace("   Hello world         "));

        System.out.println("\nTask 2:");
        System.out.println(replaceFirstLast("Tech Global"));

        System.out.println("\nTask 3:");
        System.out.println(hasVowel("Java"));

        System.out.println("\nTask 4:");
        checkAge(2006);
        checkAge(2005);
        checkAge(2050);
        checkAge(1920);
        checkAge(1800);

        System.out.println("\nTask 5:");
        System.out.println(averageOfEdges(-2, -2, 10));

        System.out.println("\nTask 6:");
        System.out.println(Arrays.toString(noA(new String[]{"apple", "appium", "ABC", "Alex", "A"})));

        System.out.println("\nTask 7:");
        System.out.println(Arrays.toString(no3or5(new int[]{10, 11, 12, 13, 14, 15})));

    }
}