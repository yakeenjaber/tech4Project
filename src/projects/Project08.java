package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Project08 {

    //Task 1:
    public static int countMultipleWords(String[] words){
        int count = 0;
        for (String str : words) {
            if(str.trim().contains(" ")) count++;
        }
        return count;
    }

    //Task 2:
    public static List<Integer> removeNegatives (List<Integer> numbers) {
        List<Integer> listNums = new ArrayList<>();
        for (int number : numbers) {
            if (number >= 0) listNums.add(number);
        }
        return listNums;
    }

    //Task 3:
    public static boolean validatePassword(String password){
        //with regex
//        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{8,20}$";
//        Pattern pattern = Pattern.compile(regex);
//        return pattern.matcher(password).matches();

        //without regex
        int upper = 0, lower = 0, digit = 0, special = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.length() >= 8 && password.length() <= 16 && !password.contains(" ")) {
                if (Character.isUpperCase(password.charAt(i))) upper++;
                if (Character.isLowerCase(password.charAt(i))) lower++;
                if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))) special++;
                if (Character.isDigit(password.charAt(i))) digit++;
            }
        }
        return (upper > 0 && lower > 0 && digit > 0 && special > 0);
    }

    //Task 4:
    public static boolean validateEmailAddress(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }

        //Regex is life hacks lololololololo

    public static void main(String[] args) {
        System.out.println("Task 1: ");
        String[] strings = {"foo", "", " ", "foo bar", "java is fun", " ruby "};
        System.out.println(countMultipleWords(strings));

        System.out.println("\nTask 2:");
        Integer[] numbers = {2, -5, 6, 7, -10, -78, 0, 15};
        List<Integer> number= new ArrayList<>(Arrays.asList(numbers));
        System.out.println(removeNegatives(number));

        System.out.println("\nTask 3: ");
        System.out.println(validatePassword("Abcd123!"));

        System.out.println("\nTask 4: ");
        System.out.println(validateEmailAddress("abc1d@gmail.com"));
    }

}
