package RECURSION;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.print("0  1  1  ");
        fibonacciSeries(30,2,1);
        
    }

    private static void fibonacciSeries(int i, int j, int k) {
        if(j>i){
            return;
        }
        System.out.print(j+"  ");
        fibonacciSeries(i, j+k, j);
    }
}
