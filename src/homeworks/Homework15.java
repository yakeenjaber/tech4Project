package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework15 {
    public static void main(String[] args) {

        //Task 1:
        System.out.println("Task 1: ");

        Integer[] numbers1 = {10, 23, 67, 23, 78};
        List<Integer> numbers = new ArrayList<>(Arrays.asList(numbers1));

        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);


        //Task 2:
        System.out.println("\nTask 2: ");

        String[] colors1 = {"Blue", "Brown", "Red", "White", "Black", "Purple"};
        List<String> colors = new ArrayList<>(Arrays.asList(colors1));

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);


        //Task 3:
        System.out.println("\nTask 3: ");

        Integer[] numbers3 = {23, -34, -56, 0, 89, 100};
        List<Integer> number33 = new ArrayList<>(Arrays.asList(numbers3));

        System.out.println(number33);
        Collections.sort(number33);
        System.out.println(number33);


        //Task 4:
        System.out.println("\nTask 4: ");

        String[] cities1 = {"Istanbul", "Berlin", "Madrid", "Paris"};
        List<String> cities = new ArrayList<>(Arrays.asList(cities1));

        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);


        //Task 5:
        System.out.println("\nTask 5: ");

        String[] marvel1 = {"Spider Man", "Iron Man", "Black Panther", "Deadpool", "Captain America"};
        List<String> marvel = new ArrayList<>(Arrays.asList(marvel1));

        System.out.println(marvel);
        if (marvel.contains("Wolverine")) System.out.println("true");
        else System.out.println("false");


        //Task 6:
        System.out.println("\nTask 6: ");

        String[] avengers1 = {"Hulk", "Black Widow", "Captain America", "Iron Man"};
        List<String> avengers = new ArrayList<>(Arrays.asList(avengers1));

        Collections.sort(avengers);
        System.out.println(avengers);
        if (avengers.contains("Hulk") && avengers.contains("Iron Man")) System.out.println("true");
        else System.out.println("false");


        //Task 7:
        System.out.println("\nTask 7: ");

        Character[] characters1 = {'A', 'x', '$', '%', '9', '*', '+', 'F', 'G'};
        List<Character> characters = new ArrayList<>(Arrays.asList(characters1));

        System.out.println(characters);
        for (char chars : characters) {
            System.out.println(chars);
        }


        //Task 8:
        System.out.println("\nTask 8: ");

        String[] objects1 = {"Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"};
        List<String> objects = new ArrayList<>(Arrays.asList(objects1));


        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);

        int countM = 0;
        int countNotAaEe = 0;
        for (String str : objects) {
            if (str.toLowerCase().startsWith("m")) countM++;
            if (!str.toLowerCase().contains("a") && (!str.toLowerCase().contains("e"))) countNotAaEe++;
        }
        System.out.println(countM);
        System.out.println(countNotAaEe);


        //Task 9:
        System.out.println("\nTask 9: ");

        String[] kitchen1 = {"Plate", "spoon", "fork", "Knife", "cup", "Mixer"};
        List<String> kitchen = new ArrayList<>(Arrays.asList(kitchen1));


        int countUpper = 0;
        int countLower = 0;
        int countPs = 0;
        int countStartEndP = 0;

        for (String str : kitchen) {
            if (Character.isUpperCase(str.charAt(0))) countUpper++;
            if (Character.isLowerCase(str.charAt(0))) countLower++;
            if (str.contains("P") || str.contains("p")) countPs++;
            if (str.startsWith("P") || str.startsWith("p")) countStartEndP++;
        }

        System.out.println(kitchen);
        System.out.println("Elements starts with uppercase = " + countUpper);
        System.out.println("Elements starts with lowercase = " + countLower);
        System.out.println("Elements having P or p = " + countPs);
        System.out.println("Elements starting or ending with P or p = " + countStartEndP);


        //Task 10:
        System.out.println("\nTask 10: ");

        Integer[] number10 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        List<Integer> numbers10 = new ArrayList<>(Arrays.asList(number10));

        int countDiv10 = 0;
        int countEvenMore15 = 0;
        int countOddLess20 = 0;
        int countLess15More50 = 0;

        for (int nums : numbers10) {
            if (nums / 10 == 0) countDiv10++;
            if (nums % 2 == 0 && nums > 15) countEvenMore15++;
            if (nums % 2 == 1 && nums < 20) countOddLess20++;
            if (nums < 15 || nums > 50) countLess15More50++;
        }

        System.out.println("Elements that can be divided by 10 = " + countDiv10);
        System.out.println("Elements that are even and greater than 15 = " + countEvenMore15);
        System.out.println("Elements that are odd and less than 20 = " + countOddLess20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + countLess15More50);

    }
}
