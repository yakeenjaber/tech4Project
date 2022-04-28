package recursion;

public class _02_ProductOfNumbers {

    /*
Write a public static recursive method that takes an int n argument
and returns the product of all numbers starting from 1 to int n
EXAMPLE:
if n = 5
1*2*3*4*5 = 120

result = 120
 */

    public static int recursiveProduct(int n){
        if (n > 1) return  n * recursiveProduct(n-1);
        return 1;

    }

    public static void main(String[] args) {
        System.out.println(recursiveProduct(-2));
        System.out.println(recursiveProduct(0));
        System.out.println(recursiveProduct(2));
        System.out.println(recursiveProduct(4));
        System.out.println(recursiveProduct(5));
    }
}
