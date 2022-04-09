package utilities;
//PROJECT 4
public class CharacterHelper {

    //Checks to see if character is a space
    public static boolean isSpace(char c) {
        return c == ' ';
    }

    //Checks to see if character is a digit
    public static boolean isDigit(char c) {
        return c >= 48 && c <= 57;
    }

    //Checks to see if character is a UPPERCASE
    public static boolean isUppercase(char c) {
        return c >= 65 && c <= 90;
    }

    //Checks to see if character is lowercase
    public static boolean isLowercase(char c) {
        return c >= 97 && c <= 122;
    }

    //Checks to see if character is a letter
    public static boolean isLetter(char c) {
        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }

    //Checks to see if character is a vowel
    public static boolean isVowel(char c) {
        return (c == 65 || c == 69 || c == 73 || c == 79 || c == 85 || c == 97
                || c == 101 || c == 105 || c == 111 || c == 117);
    }
    //Checks to see if character is a consonant
    public static boolean isConsonant(char c) {
        return (c != 65 && c != 69 && c != 73 && c != 79 && c != 85 && c != 97
                && c != 101 && c != 105 && c != 111 && c != 117);
    }
    public static int countChar(String str, char c){
        int count = 0;
        for(int i=0; i < str.length(); i++)
        {    if(str.charAt(i) == c)
            count++;
        }
        return count;
    }
}
