package projects;

import java.util.Arrays;


public class Project07 {

    //Task 1:
    public static void findGreatestAndSmallestWithSort (int[] array) {
        int a = array.length;
        Arrays.sort(array);
        System.out.println("Smallest = " + array[0]);
        System.out.println("Greatest = " + array[a - 1]);
    }
    //Task 2:
    public static void findGreatestAndSmallest (int[] array) {
        int max = array[0];
        for (int number : array) {
            max = Math.max(max, number);
        }

        int min = array[0];
        for (int number : array) {
            min = Math.min(min, number);
        }
        System.out.println("Smallest = " + min);
        System.out.println("Greatest = " + max);
    }

    //Task 3:
    public static void findSecondGreatestAndSmallestWithSort (int[] array){
        int a = array.length;
        Arrays.sort(array);
        System.out.println("Second Smallest = " + array[1]);
        System.out.println("Second Greatest = " + array[a - 2]);
    }


    //Task 4:
    public static void findSecondGreatestAndSmallest (int[] array) {
        int smallest = Math.min(array[0], array[1]); // 1
        int secondSmallest = Math.max(array[0], array[1]); // 2
        int greatest = Math.max(array[0], array[1]);
        int secondGreatest = Math.min(array[0], array[1]);

        //2, 3, 7, 1, 1, 7
        for (int number : array) {
            if (number < secondSmallest && number < smallest) {
                secondSmallest = smallest;
                smallest = number;
            } else if (number < secondSmallest && number != smallest) secondSmallest = number;
        }
        for (int number : array) {
            if (number < secondGreatest && number < greatest) {
                secondGreatest = greatest;
                greatest = number;
            } else if (number < secondGreatest && number != greatest) secondGreatest = number;
        }
        System.out.println("Second Smallest = " + secondSmallest);
        System.out.println("Second Greatest = " + secondGreatest);
    }


    //Task 5:
    public static void findDuplicatedElementsInAnArray (String[] array){
        for (int i = 0; i < array.length-1; i++){
            for (int j = i+1; j< array.length; j++){
                if(array[i] == array[j]){
                    System.out.println("Duplicate elements is " + array[i]);
                }
            }
        }
        }
    //Task 6:
    public static void findMostRepeatedElementInAnArray (String[] array){
        String element = "";
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            String tempElement = array[i];
            int tempCount = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == tempElement)
                    tempCount++;
                if (tempCount > count){
                    element = tempElement;
                    count = tempCount;
                }
            }
        }
        System.out.println(element);
        }
        /* IGNORE THIS
    public static void main(String[] args) {
        findSecondGreatestAndSmallest(new int[]{11, 21, 3, 34, 53});
        findDuplicatedElementsInAnArray(new String []{ "foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"});
        findMostRepeatedElementInAnArray(new String[]{"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"});
    }

         */
    }
