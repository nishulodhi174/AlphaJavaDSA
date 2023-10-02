package RECURSION;

public class Exercise7 {
    public static void main(String[] args) {
        int a[] = {2,4,6,8,5,52,11,12,51,14,5};
        System.out.println(findNum(a,0,5));
    }

    private static int findNum(int[] a, int i, int k) {
        if(i == a.length-1){
            int v = k == a[i]?i:-1;
            return v;
        }
        if(a[i] == k){
            return i;
        }
        return findNum(a, i+1, k);
    }
}
