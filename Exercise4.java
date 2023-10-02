package RECURSION;

public class Exercise4 {
    public static void main(String[] args) {
        
        int sum = 0;
        int n= 5;
        findSum(sum,n);
    }

    private static void findSum(int sum, int n) {
        if(n == 0){
            System.out.println(sum);
            return;
        }
        sum = sum+n;
        findSum(sum,n-1);
    }
}
