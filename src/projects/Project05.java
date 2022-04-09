package projects;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;
import utilities.StringHelper;

public class Project05 {

    public static void main(String[] args) {

        //Task 1:
        System.out.println("Task 1: ");

        String str = ScannerHelper.getAStringFromUser();

        //System.out.println("First 4:" + s);
        //System.out.println("Last 4 " + s1);
        if (str.length() < 8) System.out.println("This String does not have 8 characters");
        else {
            String s = str.substring(0, 4); //First 4
            String s1 = str.substring(str.length() - 4); //Last 4
            System.out.println(((s1.concat(str.substring(4, str.length() - 4)).concat(s))));
        }

        //Task 2:
        System.out.println("\nTask 2:");

        String str2 = ScannerHelper.getAsentenceFromUser();

        if(str2.trim().contains(" ")) {
            String str2First = str2.substring(0,str2.indexOf(32));
            String str2Middle = str2.substring(str2.indexOf(32),str2.lastIndexOf(32)+1);
            String str2Last = str2.substring(str2.lastIndexOf(32)+1);
            System.out.println(str2Last + str2Middle + str2First);
        }
        else System.out.println("This sentence does not have 2 or more words to swap");


        //Task 3
        System.out.println("\nTask 3:");

        String s1_task3 = "I like idiot behaviors";
        //String s2_task3 = "I like idiot behaviors";
        //String s3_task3 = "I had some stupid t-shirts in the past and also some idiot looking shoes";

        if (s1_task3.contains("stupid") || s1_task3.contains(("idiot"))) {
            System.out.println(s1_task3.replace("stupid", "nice").replace("idiot", "nice"));
        } else System.out.println(s1_task3);

        //Task 4:
        System.out.println("\nTask 4: ");
        String name = ScannerHelper.getANameFromUser();
        int len = name.length();


        if (len < 2) System.out.println("Invalid Input!!!");
        else {
            System.out.println(StringHelper.getMiddle(name));
        }

        //Task 5:
        System.out.println("\nTask 5: ");

        String country = ScannerHelper.getACountryFromUser();
        if (country.length() < 5) System.out.println("Invalid Input!!!");
        else System.out.println(country.substring(2, country.length() - 2));


        //Task 6:
        System.out.println("\nTask 6: ");

        String address = ScannerHelper.getAnAddressFromUser();

        System.out.println(address.replace("a", "*").replace("A", "*").replace("e", "#")
                .replace("E", "#").replace("i", "+").replace("I", "+").replace("u", "$")
                .replace("U", "$").replace("o", "@").replace("O", "@"));

        //Task 7
        System.out.println("\nTask 7: ");

        int num1 = RandomNumberGenerator.getRandomNumber(0, 25);
        int num2 = RandomNumberGenerator.getRandomNumber(0, 25);


        for(int i = Math.min(num1 ,num2); i <=Math.max(num1 ,num2); i++){
            if(i % 5 != 0){
                System.out.println(i);
            }
        }
    }
}