package RECURSION;

public class Exercise1 {
    public static void main(String[] args) {
        int n=8;
        System.out.println(decRecurjan(n));
    }
    public static int decRecurjan(int n) {
        //base class
        if(n==1){
            return 0;
        }
        System.out.println(n);
        decRecurjan(n-1);
        return 1;        
    }
}
