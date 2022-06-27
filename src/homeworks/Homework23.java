package homeworks;

import primitives.Int;

import java.util.HashMap;
import java.util.Map;


public class Homework23 {
    public static Map<Integer, String> parseData(String key){
        String[] parse = key.replaceAll("[{]", " {").trim().split(" ");
        Map<Integer, String> map = new HashMap<>();
        for (String s : parse) {
            map.put(Integer.parseInt(s.replaceAll("[{}a-zA-Z]", "")), s.replaceAll("[{\\d+}]", ""));
        }
        return map;
    }

    public static double calculateTotalPrice1(Map<String, Double> grocery, String key) {
        String[] fruits = key.replaceAll("[{} ,]", "").split("=\\d+");
        String[] total = key.replaceAll("[{} ,]", "").replaceFirst("[a-zA-Z]+=", "").split("[a-zA-Z]+=");
        double sum = 0.00;
        for (int i = 0; i < fruits.length; i++) {
            for (int j = 0; j < Integer.parseInt(total[i]); j++) {
                sum += grocery.get(fruits[i]);
            }
        }
        return Math.round(sum * 100.0) / 100.0;
    }

    public static double calculateTotalPrice2(Map<String, Integer> userMap) {
    //NOT DONE
    //DONT FORGET TO FINISH
    return 0;
    }


        public static void main(String[] args) {
        System.out.println("Task 1");
        String testData1 = "{104}LA{101}Paris{102}Berlin{103}Chicago{100}London";
        System.out.println(parseData(testData1));

//        System.out.println("Task 2");
//        //Map<String, Double> task2Map = Map.of("Apple", 2.00, "Orange", 3.29, "Mango", 4.99, "Pineapple", 5.25);
//        String task2Data = "{Apple=2, Pineapple = 1, Orange = 3}";
//        System.out.println(calculateTotalPrice1(task2Map, task2Data));
    }

}
