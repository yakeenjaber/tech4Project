package homeworks;

import java.util.Arrays;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Homework19 {
    //Task 1
    public static String noDigit(String str){
            str = str.replaceAll("[0-9]", "");
        return str;
    }

    //Task 2
    public static String noVowel(String str){
        str = str.replaceAll("[aeiouAEIOU]", "");
    return str;
    }

    //Task 3
    public static int sumOfDigits(String str){
        int total = 0;
        for (char c: str.toCharArray()) {
            if (Character.isDigit(c)) {
                total += Integer.parseInt(String.valueOf(c));
            }
        }
        return total;
    }

    //Task 4
    public static boolean hasUpperCase(String str){
        boolean b = false;
        for (char c : str.toCharArray())
        if (Character.isUpperCase(c)){
            b = true;
        }
        return b;
    }

    //Task 5:
    public static int middleInt(int a, int b, int c){
        int median;
        median = Math.max(min(a,b), min(max(a,b),c));
    return median;
    }

    //Task 6:
    public static int[] no13(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13) arr[i] = 0;
        }
        return arr;
    }

    //Task 7:
    public static int[] arrFactorial(int[] arr) {
        return arr;
    }

    //Task 8:
    public static String[] categorizeCharacters(String str) {
        return new String[]{str};
    }

        public static void main(String[] args) {
        System.out.println(noDigit("Hello123"));
        System.out.println(noVowel("JAVA"));
        System.out.println(sumOfDigits("johns age is 123"));
        System.out.println(hasUpperCase("John is cool and has 1 uppercase"));
        System.out.println(middleInt(1,1,2));
        System.out.println(Arrays.toString(no13(new int[]{13, 12, 11})));
    }

}
