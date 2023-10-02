package RECURSION;

public class Exercise3 {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        int fact=1;
        findFact(n,i,fact);
    }
    public static void findFact(int n,int i,int fact) {
        if (i==n){
            fact=fact*i;
            System.out.println(fact);
            return;
        }
        fact=fact*i;
        findFact(n,i+1,fact);
    }
}
