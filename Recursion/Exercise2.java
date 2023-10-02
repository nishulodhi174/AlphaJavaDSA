package RECURSION;

public class Exercise2 {
    public static void main(String[] args) {
        int n=10;
        int ite=1;
        incRecurjan(n,ite);
    }
    public static void incRecurjan(int n,int ite) {
        if (ite == n){
            System.out.print(ite);
            return;
        }
        System.out.print(ite+" ");
        incRecurjan(n,ite+1);
    }
}
