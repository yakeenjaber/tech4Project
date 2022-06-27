package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework22 {

    public static int[] fibonacciSeries1(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

    public static int fibonacciSeries2(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n - 1];
    }
/*
    public static int[] findUniques(int[] arr1, int[] arr2){
        ArrayList<Integer> arr = new ArrayList<>();
        if ((arr1.length == 0) && arr2.length == 0){
            return arr1;
        }
        //else{
        return Arrays.toString(arr);
        }
    }
*/

    public static boolean isPowerOf3(int num){
        for (int i = 0; i < num; i++)
        if (Math.pow(3, i) == num){
            return true;
        }
        return false;
    }

    public static int firstDuplicate(int [] arr) { //needs work still *NOT ALL TEST CASES PASS*
        for (int i = 0; i < 10; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Task 1");
        System.out.println(Arrays.toString(fibonacciSeries1(7)));
        System.out.println("Task 2");
        System.out.println(fibonacciSeries2(2));
        System.out.println("Task 4");
        System.out.println(isPowerOf3(9));
        System.out.println("Task 5");
        System.out.println(firstDuplicate(new int[]{1 ,2 ,2, 3}));


    }


}
