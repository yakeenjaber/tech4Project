package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework16 {

    //Task 1
    public static int countWords(String str){
        str = str.trim();
        int count = 0;
        for (int i = 0; i <str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) count++;
        }
        return count + 1;
    }

    //Task 2
    public static int countA(String str){
        str = str.trim().toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') count++;
        }
        return count;
    }

    //Task 3
    public static int countPos (ArrayList<Integer> numbers){
        int count = 0;
        for (int num:numbers) {
            if (num > 0) count++;
        }
        return count;
    }

    //Task 4
    public static List<Integer> removeDuplicateNumbers(List<Integer> numbers){
        List<Integer> updatedList = new ArrayList<>();

        for (int num: numbers) {
            if (!updatedList.contains(num)) updatedList.add(num);
        }
        return updatedList;
    }

    //Task 5
    public static List<String> removeDuplicateElements(List<String> elements){
        List<String> updatedList = new ArrayList<>();

        for (String element: elements) {
            if (!updatedList.contains(element)) updatedList.add(element);
        }
        return updatedList;
    }

    //Task 6
    public static String removeExtraSpaces(StringBuilder str){
        int i = 1;
        while (i < str.length()-1) {
            if ((str.charAt(i - 1) == ' ' && str.charAt(i) == ' ') || (str.charAt(i + 1) == ' ' && str.charAt(i) == ' ')) {
                str.deleteCharAt(i);
                i--;
            }
            i++;
        }
            return str.toString().trim();
        }

        //Task 7:
    public static int[] add(int[] arr1, int[] arr2){
        int greaterLength = Math.max(arr1.length, arr2.length);
        int[] arr3 = new int[greaterLength];
        int i = 0;
        while(i < arr1.length && i < arr2.length){
            arr3[i] = arr1[i] + arr2[i];
            i++;
        }
        while(i < arr1.length){
            arr3[i] = arr1[i];
            i++;
        }
        while(i < arr2.length){
            arr3[i] = arr2[i];
            i++;
        }
        return arr3;
        }

        //Task 8
    public static int findClosestTo10(int[] array){
        //ummm idk
        //ill attend the recap to learn how to do it
        return 1;
        }

    public static void main(String[] args) {
        System.out.println("Task 1:");
        System.out.println(countWords("    Selenium is the most common UI automation tool.   "));

        System.out.println("Task 2:");
        System.out.println(countA("TechGlobal is a QA bootcamp"));

        System.out.println("Task 3:");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-45, 0, 0, 34, 5, 67));
        System.out.println(countPos(numbers));

        System.out.println("Task 6:");
        System.out.println(removeExtraSpaces(new StringBuilder("  I   am      learning     Java     ")));

        System.out.println("Task 7:");
        int[] arr1 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
        int[] arr2 = {10, 3, 6, 3, 2};
        System.out.println(Arrays.toString(add(arr1, arr2)));

    }
}
