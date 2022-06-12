package homeworks;

public class Homework21 {

    //Task 1
    public static void fizzBuzz1(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
    //Task 2
    public static String fizzBuzz2(int num){
        String str = "";
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) str = "FizzBuzz";
            else if (i % 3 == 0) str = "Fizz";
            else if (i % 5 == 0) str = "Buzz";
            else str = String.valueOf(num);
        }
        return str;
    }
    //Task 3

    public static int findSumNumbers(String s){
        int sum = 0;
        String temp = "0";
        for (int i = 0; i < s.length(); i++){
            if (Character.isDigit(s.charAt(i))) temp += s.charAt(i);
            else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }return sum + Integer.parseInt(temp);
    }


    //Task 4
    public static int findBiggestNumber(String s){
        int max = 0;
        String temp = s.replaceAll("[^\\d]", " ");
        String[] temp2 = temp.replaceAll("[\\s]+", " ").split(" ");
        for (String element: temp2){
            if (!element.isEmpty()){
                if (Integer.parseInt(element) > max) max = Integer.parseInt(element);
            }
        }
        return max;
    }

    //Task 5
    public static String countSequenceOfCharacters(String str){
        String string = "";
        int count = 0;
        for (int i = 0; i< str.length(); i++){
            if (str.charAt(i) == str.charAt(i+1)){
                count++;
            }
        }
        return string;
    }


    public static void main(String[] args) {
        //TESTING TASK 1
        System.out.println("Task 1");
        fizzBuzz1(3);
        fizzBuzz1(5);
        fizzBuzz1(18);

        //TESTING TASK 2
        System.out.println("Task 2");
        System.out.println(fizzBuzz2(0));
        System.out.println(fizzBuzz2(1));
        System.out.println(fizzBuzz2(3));
        System.out.println(fizzBuzz2(5));
        System.out.println(fizzBuzz2(15));

        //TESTING TASK 3
        System.out.println("Task 3");
        System.out.println(findSumNumbers("abc$"));
        System.out.println(findSumNumbers("a1b4c 6#"));

    }



}
