package RECURSION;

public class Exercise8 {
    public static void main(String[] args) {
        int a[] = {2,4,6,8,5,52,11,12,51,14,1};
        System.out.println(findNum(a,a.length-1,5));
    }

    private static int findNum(int[] a, int i, int k) {
        if(i == 0){
            int v = k==a[i]?i:-1;
            return v;
        }
        if(a[i] == k){
            return i;
        }
        return findNum(a, i-1, k);
    }
}
