package homeworks;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {

        //Task 1:
        System.out.println("\nTask 1: ");
        int[] array1 = {89, 0, 23, 0, 12, 0, 15, 34, 0, 7};

        System.out.println(array1[3]);
        System.out.println(array1[0]);
        System.out.println(array1[9]);
        System.out.println(Arrays.toString(array1));

        //Task 2:
        System.out.println("\nTask 2: ");
        //String[] array2 = {null, "abc", null, null, "xyz"};
        String[] array2 = new String[5];
        array2[1] = "abc";
        array2[4] = "xyz";

        System.out.println(array2[3]);
        System.out.println(array2[0]);
        System.out.println(array2[4]);
        System.out.println(Arrays.toString(array2));

        //Task 3:
        System.out.println("\nTask 3: ");
        int[] array3 = {23, -34, -56, 0, 89, 100};

        System.out.println(Arrays.toString(array3));
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));

        //Task 4:
        System.out.println("\nTask 4: ");
        String[] array4 = {"Germany", "Argentina", "Ukraine", "Romania"};

        System.out.println(Arrays.toString(array4));
        Arrays.sort(array4);
        System.out.println(Arrays.toString(array4));

        //Task 5:
        System.out.println("\nTask 5: ");
        String[] array5 = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};

        System.out.println(Arrays.toString(array5));
        boolean found = false;
        String searchedValue = "Pluto";

        for (String s : array5)
            if (s == searchedValue) {
                found = true;
                break;
            }
        System.out.println(found);


        //Task 6:
        System.out.println("\nTask 6: ");
        String[] array6 = {"Garfield", "Tom", "Sylvester", "Azrael"};

        Arrays.sort(array6);
        System.out.println(Arrays.toString(array6));
        System.out.println(Arrays.binarySearch(array6, "Garfield") >= 0 && Arrays.binarySearch(array6, "Felix") >= 0);

        //Task 7:
        System.out.println("\nTask 7: ");
        double[] array7 = {10.5, 20.75, 70.0, 80.0, 15.75};

        System.out.println(Arrays.toString(array7));

        for (double nums : array7) {
            System.out.println(nums);
        }

        //Task 8:
        System.out.println("\nTask 8: ");
        char[] array8 = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        int countLetters = 0;
        int countLower = 0;
        int countUpper = 0;
        int countDigits = 0;
        int countSpecial = 0;

        for (char chars: array8) {
            if (Character.isLetter(chars)) {
                countLetters++;
                if(Character.isLowerCase(chars)) {
                    countLower++;
                }else {
                    countUpper++;
                }
            }else if (Character.isDigit(chars)) {
                countDigits++;
            }else{
                countSpecial++;
            }
        }

        System.out.println(Arrays.toString(array8));
        //System.out.println(array8.length);
        System.out.println("Letters = " + countLetters);
        System.out.println("Uppercase letters = " + countUpper);
        System.out.println("Lowercase letters =  " + countLower);
        System.out.println("Digits = " + countDigits);
        System.out.println("Special characters = " + countSpecial);


        //Task 9:
        System.out.println("\nTask 9: ");
        String[] array9 = {"Pen", "notebook", "Book","paper", "bag", "pencil", "Ruler"};

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countBP = 0;
        int countBookPen = 0;

        for (String character: array9) {
            if (Character.isUpperCase(character.charAt(0))) {
                countUpperCase++;
            }
            else{
                countLowerCase++;
            }
            if (character.toLowerCase().startsWith("b") || character.toLowerCase().startsWith("p")) {
                countBP++;
            }
            if (character.toLowerCase().contains("book") || character.toLowerCase().contains("pen")) {
                countBookPen++;
            }
        }

        System.out.println(Arrays.toString(array9));
        System.out.println("Elements starts with uppercase = " + countUpperCase);
        System.out.println("Elements starts with lowercase = " + countLowerCase);
        System.out.println("Elements starting with B or P =  " + countBP);
        System.out.println("Elements having \"book\" or \"pen\" =  " + countBookPen);

        //Task 10:
        System.out.println("\nTask 10: ");
        int[] array10 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};

        int countLess10 = 0;
        int countMore10 = 0;
        int countIs10 = 0;

        for (int num:array10) {
            if (num>10) countMore10++;
            else if (num<10) countLess10++;
            else countIs10++;
        }

        System.out.println(Arrays.toString(array10));
        System.out.println("Elements that are more than 10 = " + countMore10);
        System.out.println("Elements that are less than 10 = " + countLess10);
        System.out.println("Elements that are 10 = " + countIs10);

        //Task 11:
        System.out.println("\nTask 11: ");
        int[] arrayOne = {5, 8, 13, 1 ,2};
        int[] arrayTwo = {9, 3, 67, 1, 0};
        int[] arrayThree = new int[5];

        for (int i = 0; i < arrayTwo.length; i++) {
            arrayThree[i] = Math.max(arrayOne[i], arrayTwo[i]);
        }
        System.out.println("1st array is =  " + Arrays.toString(arrayOne));
        System.out.println("2nd array is =  " + Arrays.toString(arrayTwo));
        System.out.println("3rd array is =  " + Arrays.toString(arrayThree));
    }
}
