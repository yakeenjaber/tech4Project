package collections;

import primitives.Int;

import java.util.HashMap;
import java.util.Map;

public class hashMap {


    public static HashMap<String, Integer> wordCount(String [] strs) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : strs) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                int count = map.get(s);
                map.put(s, count + 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String [] arr = {"a", "b", "a", "c", "b"};
        System.out.println(wordCount(arr));
    }
}
