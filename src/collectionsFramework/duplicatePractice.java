package collectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class duplicatePractice {

    public static void main(String[] args) {
        System.out.println("Original");
        String[] arr = {"John", "Henry", "Bernard", "Henry", "Glads", "Percy", "John"};

        System.out.println(Arrays.asList(arr));

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println("\nBefore Hash");
        System.out.println(list);
        System.out.println(list.size());

        HashSet<String> hash = new HashSet<>(list);
        System.out.println("After hash");
        System.out.println(hash);
        System.out.println(hash.size());
    }
}
