package recursion;

public class _01_SumOfNumbers {

    public static int sumNumbers(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum = sum + i;
        }
        return sum;
    }


    public static int recursiveSum(int n){
        if (n > 0) return n + recursiveSum(n-1);
        return 0;
    }







    public static void main(String[] args) {
        System.out.println(sumNumbers(5)); //15
        System.out.println(sumNumbers(7)); //28
        System.out.println(sumNumbers(-5));
        System.out.println(recursiveSum(5));
        System.out.println(recursiveSum(-5));
    }
}
