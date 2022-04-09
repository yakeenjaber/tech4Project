package homeworks;

import utilities.RandomNumberGenerator;

import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {

        //Task 1:
        System.out.println("Task 1: ");
        for (int i = 1; i <= 10; i++) {
            if (i % 10 == 0) System.out.println("FooBar");
            else if (i % 5 == 0) System.out.println("Bar");
            else if (i % 2 == 0) System.out.println("Foo");
            else System.out.println(i);
        }

        //Task 2:
        System.out.println("\nTask 2: ");
        int[] numbers = {0, -4, -7, 0, 5, 10, 45};

        int posNum = 0;
        int negNum = 0;

        for (int nums : numbers) {
            if (nums > 0 && posNum == 0) {
                posNum = nums;
            } else if (nums < 0 && negNum == 0) {
                negNum = nums;
            }
        }
        System.out.println("First positive number is: " + posNum);
        System.out.println("First negative number is: " + negNum);

        //Task 3:
        System.out.println("\nTask 3: ");

        int rand1 = RandomNumberGenerator.getRandomNumber(1, 10);
        int rand2 = RandomNumberGenerator.getRandomNumber(1, 10);
        int rand3 = RandomNumberGenerator.getRandomNumber(1, 10);
        int rand4 = RandomNumberGenerator.getRandomNumber(1, 10);
        int rand5 = RandomNumberGenerator.getRandomNumber(1, 10);

        int[] randArray = {rand1, rand2, rand3, rand4, rand5};
        System.out.println(Arrays.toString(randArray));

        boolean twoOrThree = false;
        for (int i = 0; i < 5; i++) {
            if (randArray[i] == 2 || randArray[i] == 3) {
                twoOrThree = true;
                break;
            }
        }
        System.out.println(twoOrThree);

        //Task 4:
        System.out.println("\nTask 4:");

        boolean containsApple = false;

        String[] list = {"banana", "orange", "Apple"};
        for (int i = 0; i < list.length; i++) {
            if (list[i].equalsIgnoreCase("apple")) {
                containsApple = true;
                break;
            }
        }
        System.out.println(containsApple);

        //Task 5:
        System.out.println("\nTask 5: ");

        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};
        boolean bool = false;

        for (int number1 : numbers1) {
            for (int number2 : numbers2) {
                if(number1 == number2) {
                    System.out.println(number1);
                    bool = true;
                }
            }
        }
        if (bool == false) System.out.println("There is no matching elements.");

        //Task 6
        System.out.println("\nTask 6: ");

        String str = "aPple";
        char toChars[] = str.toLowerCase().toCharArray();
        System.out.println(str);

        String duplicate = "";

        for (int i = 0; i < toChars.length; i++) {
            for (int j = i + 1; j < toChars.length; j++) {
                if (!duplicate.contains(toChars[i] + "") && toChars[i] == toChars[j]) {
                    System.out.println(toChars[i]);
                    duplicate += toChars[i];
                }
            }
        }
    }
}

