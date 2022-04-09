package homeworks;

public class Practice01 {
    public static void main(String[] args) {
        //Requirement:
        //Assume that you are given a String as below;
        //String str = ”SDLC is step by step procedure to create an application”;
        //Write a program to find length of given String and the indexes of “SDLC” and “application” words


        System.out.println("Task 1: ");

        String str = "SDLC is step by step procedure to create an application";
        System.out.println("The length of the string is " + str.length()); //55
        System.out.println("The index of 'SDLC' os = " + str.indexOf("SDLC")); //0
        System.out.println("The index of 'application' is = " + str.indexOf("application")); //44


        //Requirement:
        //Assume that you are given a String as below;
        //String str = “  I know how to code with Python  ”;
        //•
        //Write a program to manipulate given String and convert it to be:
        //“I KNOW HOW TO CODE WITH JAVA”
        System.out.println("\nTask 2:");

        String str1 = "  I know how to code with Python  ";

        System.out.println(str1.trim().toUpperCase().replace("PYTHON", "JAVA"));

        //Assume that you are given a String as below;
        //String str = “    SDLC has planning, design, development, testing, deployment and maintenance phases   ”;
        //1.Find the first character of given String which is not white space
        //2.Find the last character of given String which is not white space

        System.out.println("\nTask 3: ");
        String str2 ="    SDLC has planning, design, development, testing, deployment and maintenance phases   ".trim();
        System.out.println(str2.charAt(0));
        System.out.println(str2.charAt(str2.length()-1));


        //Assume you are given 3 Strings as below;
        //String s1 = “  TECH ”;
        //String s2 = “ glo  ”;
        //String s3 = “ BAL       “;
        //Write a program that manipulates these 3 Strings and stores them in a new String s4 and s4 will get value of “TechGlobal”
        //Note: The length of s4 will be 10 at the end!!!

        System.out.println("\nTask 4:");
        String s1 = "  TECH ".trim();
        String s2 = " glo  ".trim();
        String s3 = " BAL       ".trim();

        String s4 = s1.toLowerCase().replace("t", "T") + s2.replace("g", "G") + s3.toLowerCase();
        System.out.println(s4);
    }
}
