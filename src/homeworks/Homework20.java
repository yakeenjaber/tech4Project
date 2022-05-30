package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework20 {

    //Task 1
    public static boolean hasLowerCase(String str){
        boolean b = false;
        for (char c : str.toCharArray()){
            if (Character.isLowerCase(c)){
                b = true;
            }
        }
        return b;
    }

    //Task 2
    public static ArrayList<Integer> noZero(ArrayList arr){
        ArrayList <Integer> arrayList = new ArrayList();
        for (int i = 0; i<arr.size();i++)
        if (!arrayList.get(i).equals(0)){
            arrayList.add(i);
        }
    return arrayList;
    }

    //Task 3
    public static int[] numberAndSquare(int [] arr) {       //THIS RETURNS ONLY THE SQUARED VALUES
        int[] a = arr;
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] * arr[i];
        }

        return a;
    }

    //Task 4
    public static boolean containsValue(String[] arr, String str){
        int count =0;
        for (String s : arr) {
            if (s.equals(str)){
                count++;
            }
        }
        boolean b = count > 0;
        return b;
    }

    //Task 5
    public static String reverseSentence(String str) {
        str = str.toLowerCase();
        String[] words = str.split(" ");

        String rev = "";
        for (int i = words.length - 1; i >= 0; i--) {
            rev += words[i] + " ";

        }
        return rev;
    }

    //Task 6
    public static String removeStringSpecialsDigits(String str){
        str = str.replaceAll("[^a-zA-Z_ ]", "");
        return str;
    }

    //Task 7
    public static String [] removeArraySpecialsDigits(String[] arr){
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = arr[i].replaceAll("[^a-zA-Z_ ]", "");

        }
        return arr;
    }

    //Task 8
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> str1, ArrayList<String> str2){
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < str1.size(); i++){
            for(int j = 0; j < str2.size(); j++){
                if(!arr.contains(str1.get(i)) && str1.get(i).equals(str2.get(j)))
                    arr.add(str1.get(i));
            }
        }
        return arr;
    }

    //Task 9
    public static ArrayList<String> noXInVariables(ArrayList<String> str) {
        ArrayList<String> newArr = new ArrayList<>();

        for (String s : str) {
            if (!s.equalsIgnoreCase("x")) {
                s = s.replaceAll("[xX]", "");
                newArr.add(s);
            }
        }
        return newArr;
    }
/*
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(numberAndSquare(arr)));
        String[] arr1 = {"foo", "bar", "123"};
        System.out.println(containsValue(arr1, "bar"));
        System.out.println(reverseSentence("Hello my name us"));
        System.out.println(removeStringSpecialsDigits("123Java #$%is fun"));
        String[] arr2 = {"123Java", "#$%is", "fun"};
        System.out.println(Arrays.toString(removeArraySpecialsDigits(arr2)));
    }
 */
}
