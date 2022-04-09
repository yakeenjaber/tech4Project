package projects;

public class Project03 {

    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1: ");
        String s1 = "24", s2 = "5";

        //String s1 & s2
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        int sum1 = (num1 + num2);
        int sub1 = (num1 - num2);
        double div1 = ((double) num1 / (double) num2);
        int prd1 = (num1 * num2);
        int rem1 = (num1 % num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " = " + sum1);
        System.out.println("The subtraction of " + num1 + " and " + num2 + " = " + sub1);
        System.out.println("The division of " + num1 + " and " + num2 + " = " + div1);
        System.out.println("The product of " + num1 + " and " + num2 + " = " + prd1);
        System.out.println("The remainder of " + num1 + " and " + num2 + " = " + rem1);

        //Task 2:
        System.out.println("\nTask 2: ");

        double random = (Math.random() * 36);
        int castRand = (int) random;

        if (castRand == 2 || castRand == 3 || castRand == 5 || castRand == 7 || castRand == 11 || castRand == 13 || castRand == 17 ||
                castRand == 19 || castRand == 23 || castRand == 29 || castRand == 31) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else {
            System.out.println("THE NUMBER IS NOT A PRIME NUMBER");
        }

        //Task 3
        System.out.println("\nTask 3: ");

        double random1 = (Math.random() * 51);
        double random2 = (Math.random() * 51);
        double random3 = (Math.random() * 51);

        int castRandom1 = (int) random1;
        int castRandom2 = (int) random2;
        int castRandom3 = (int) random3;

        int max = Math.max(castRandom1, Math.max(castRandom2, castRandom3));
        int min = Math.min(castRandom1, Math.min(castRandom2, castRandom3));

        System.out.println("Lowest Number is = " + min);

        if (castRandom1 != max && castRandom1 != min) {
            System.out.println("Middle Number is = " + castRandom1);
        }
        else if (castRandom2 != max && castRandom2 != min) {
            System.out.println("Middle Number is = " + castRandom2);
        }
        else{
            System.out.println("Middle Number is = " + castRandom3);
        }
        System.out.println("Greatest Number is = " + max);


        //Task 4:
        System.out.println("\nTask 4:");
        char ch1 = '5';
        char ch2 = 'a';
        char ch3 = 'R';

        int ascii1 = ch1;
        int ascii2 = ch2;
        int ascii3 = ch3;

        if ((ascii1 <= 64) || (ascii1 >= 91 && ascii1 <= 96) || (ascii1 >= 123)) {
            System.out.println("Invalid character detected!!!");
        }
        else {
            if (ascii2 < 123 && ascii2 > 96)
                System.out.println("The letter is lowercase");
            else if (ascii3 > 65 && ascii3 < 91) {
                System.out.println("The letter is uppercase");
            }
        }
            //Task 5:
            System.out.println("\nTask 5: ");

            char c1 = '#';
            char c2 = 'E';
            char c3 = 'R';

            int asci1 = c1;
            int asci2 = c2;
            int asci3 = c3;

        System.out.println(asci1);

            if ((ascii1 <= 64) || (ascii1 >= 91 && ascii1 <= 96) || (ascii1 >= 123)) {
                System.out.println("Invalid character detected!!!");
            }
            else if (asci2 == 65 || asci2 == 69 || asci2 == 73 || asci2 == 79 || asci2 == 85 || asci2 == 97 || asci2 == 101
                    || asci2 == 105 || asci2 == 111 || asci2 == 117) {
                System.out.println("The letter is vowel");
                }
            else if (asci3 == 65 || asci3 == 69 || asci3 == 73 || asci3 == 79 || asci3 == 85 || asci3 == 97 || asci3 == 101
                    || asci3 == 105 || asci3 == 111 || asci3 == 117) {
                System.out.println("The letter is not consonant");
            }

            //Task 6
            System.out.println("\nTask 6: ");

            char c = '*';

            int asci = c;
            if ((ascii1 <= 64) || (ascii1 >= 91 && ascii1 <= 96) || (ascii1 >= 123)) {
                System.out.println("Special character is = " + c);
            }
            else{
                    System.out.println("Invalid character detected!!!");
                }

            //Task 7
            System.out.println("\nTask 7: ");

            char given = '@';
            int give = given;

            if (give >= 97 && give <= 122) {
                System.out.println("Character is a letter");
            }
            else if (give >= 48 && give <= 57) {
                System.out.println("Character is a digit");
            }
            else if (give <= 64 && give >= 58) {
                System.out.println("Character is a special character");
            }
        }
    }