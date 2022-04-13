package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basic_Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(" ");
        Matcher matcher = pattern.matcher("I love TechGlobal");

        System.out.println(matcher.matches()); //returns true or false --> checks if given string matches given pattern

        int count = 1;
        while (matcher.find()){
            count ++;
        }
        System.out.println(count);
    }
}
